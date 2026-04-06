package com.xworkz.curd.controller;


import com.xworkz.curd.dto.UserDto;
import com.xworkz.curd.entity.UserEntity;
import com.xworkz.curd.service.UserService;
import com.xworkz.curd.dao.UserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private BCryptPasswordEncoder encoder;


    private String generatedOtp;


    @GetMapping("/")
    public String home() {
        return "index";
    }


    @GetMapping("/signup")
    public String signupPage() {
        return "signup";
    }

    @PostMapping("/signup")
    public String register(UserDto dto, Model model) {

        String msg = userService.register(dto);

        if (msg.equals("Signup successful")) {
            return "redirect:/login";
        }

        model.addAttribute("msg", msg);
        return "signup";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        HttpSession session,
                        Model model){

        UserDto dto = userService.login(email, password);

        if(dto != null){
            session.setAttribute("user", dto);

            // ✅ redirect to index (dashboard)
            return "redirect:/";
        }

        model.addAttribute("error", "Invalid Credentials");
        return "login";
    }
    @GetMapping("/adminDashboard")
    public String adminDashboard(HttpSession session){

        if(session.getAttribute("user") == null){
            return "redirect:/login";
        }

        return "adminDashboard";
    }

    @GetMapping("/userDashboard")
    public String userDashboard(HttpSession session){

        if(session.getAttribute("user") == null){
            return "redirect:/login";
        }

        return "userDashboard";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){

        session.removeAttribute("user");  // 🔥 remove user
        session.invalidate();             // 🔥 destroy session

        return "redirect:/";              // ✅ go to index page
    }
    @GetMapping("/readAllData")
    public String getData(Model model, HttpSession session){

        if(session.getAttribute("user") == null){
            return "redirect:/login";   // 🔒 protect
        }

        List<UserDto> users = userService.getAllUsers();
        model.addAttribute("users", users);

        return "viewAll";
    }

    @GetMapping("/forgot")
    public String forgotPage() {
        return "forgot";
    }

    @PostMapping("/sendOtp")
    public String sendOtp(@RequestParam String email, Model model) {

        UserEntity user = userDAO.findByEmail(email);

        if (user == null) {
            model.addAttribute("msg", "Email not found");
            return "forgot";
        }


        generatedOtp = String.valueOf((int) (Math.random() * 9000) + 1000);


        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setFrom("thejas6767@gmail.com");
        message.setSubject("Password Reset OTP");
        message.setText("Your OTP is: " + generatedOtp);

        mailSender.send(message);

        model.addAttribute("email", email);
        model.addAttribute("msg", "OTP sent to your email");

        return "otp";
    }

    @PostMapping("/verifyOtp")
    public String verifyOtp(@RequestParam String otp,
                            @RequestParam String email,
                            Model model){

        if(otp.equals(generatedOtp)){
            model.addAttribute("email", email);
            return "reset";
        }

        model.addAttribute("msg","Invalid OTP");
        model.addAttribute("email", email);
        return "otp";
    }

    @PostMapping("/resetPassword")
    public String resetPassword(@RequestParam String email,
                                @RequestParam String password,
                                Model model) {

        System.out.println("EMAIL: " + email);
        System.out.println("PASSWORD: " + password);

        UserEntity entity = userDAO.findByEmail(email);

        System.out.println("ENTITY: " + entity);

        if (entity != null) {

            entity.setPassword(encoder.encode(password));

            boolean updated = userDAO.update(entity);

            System.out.println("UPDATED: " + updated);

            return "redirect:/login";
        }

        model.addAttribute("msg", "User not found");
        return "reset";
    }

    @GetMapping("/profile")
    public String profile(HttpSession session, Model model){

        UserDto user = (UserDto) session.getAttribute("user");

        if(user == null){
            return "redirect:/login";
        }

        model.addAttribute("user", user);

        return "profile";
    }
    @GetMapping("/editProfile")
    public String editProfile(HttpSession session, Model model){

        UserDto user = (UserDto) session.getAttribute("user");

        if(user == null){
            return "redirect:/login";
        }

        model.addAttribute("user", user);

        return "editProfile";
    }

    @PostMapping("/updateProfile")
    public String updateProfile(UserDto dto, HttpSession session){

        UserDto user = (UserDto) session.getAttribute("user");

        if(user == null){
            return "redirect:/login";
        }

        // 🔥 IMPORTANT: keep same ID
        dto.setId(user.getId());

        userService.updateUser(dto);

        // 🔄 update session also
        session.setAttribute("user", dto);

        return "redirect:/profile";
    }
    @PostMapping("/changePassword")
    public String changePassword(@RequestParam String email,
                                 @RequestParam String oldPassword,
                                 @RequestParam String newPassword,
                                 @RequestParam String confirmPassword,
                                 Model model) {

        // ✅ trim fix
        if(!newPassword.trim().equals(confirmPassword.trim())){
            model.addAttribute("error", "New and Confirm Password do not match");
            return "profile";
        }

        UserEntity entity = userDAO.findByEmail(email);

        if(entity == null){
            model.addAttribute("error", "User not found");
            return "profile";
        }

        // ✅ old password check
        if(!encoder.matches(oldPassword, entity.getPassword())){
            model.addAttribute("error", "Old password is incorrect");
            return "profile";
        }

        // 🔐 update password
        entity.setPassword(encoder.encode(newPassword));
        userDAO.update(entity);

        model.addAttribute("success", "Password updated successfully");
        return "profile";
    }
    @GetMapping("/search")
    public String search(@RequestParam String keyword, Model model, HttpSession session){

        if(session.getAttribute("user") == null){
            return "redirect:/login";
        }

        List<UserDto> users = userService.searchUsers(keyword);

        model.addAttribute("users", users);

        return "viewUsers";
    }
    @GetMapping("/users")
    public String getAllUsers(Model model, HttpSession session){

        UserDto user = (UserDto) session.getAttribute("user");

        if(user == null){
            return "redirect:/login";
        }

        // 🔐 only admin allowed
        if(!user.getRole().equals("ADMIN")){
            return "redirect:/";
        }

        List<UserDto> users = userService.getAllUsers();
        model.addAttribute("users", users);

        return "viewUsers";  // opens viewUsers.jsp
    }
    @GetMapping("/editUser")
    public String editUser(@RequestParam int id,
                           Model model,
                           HttpSession session){

        UserDto user = (UserDto) session.getAttribute("user");

        if(user == null){
            return "redirect:/login";
        }

        if(!user.getRole().equals("ADMIN")){
            return "redirect:/";
        }

        UserDto dto = userService.getUserById(id);

        model.addAttribute("editUser", dto);

        return "editUser";
    }
    @PostMapping("/updateUser")
    public String updateUser(UserDto dto, HttpSession session){

        UserDto user = (UserDto) session.getAttribute("user");

        if(user == null || !user.getRole().equals("ADMIN")){
            return "redirect:/login";
        }

        userService.updateUser(dto);

        return "redirect:/users";
    }
    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam int id, HttpSession session){

        UserDto user = (UserDto) session.getAttribute("user");

        if(user == null || !user.getRole().equals("ADMIN")){
            return "redirect:/login";
        }

        System.out.println("Deleting ID: " + id); // 🔥 DEBUG

        userService.deleteUser(id);

        return "redirect:/users";
    }
}