package com.xworkz.project_modules.controller;


import com.xworkz.curd.dto.UserDto;
import com.xworkz.curd.service.CurdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class CurdController {

    @Autowired
    private CurdService curdService;

    @GetMapping("/signup")
    public String showSignup() { return "signup"; }

    @GetMapping("/login")
    public String showLogin() { return "login"; }

    @PostMapping("/registerUser")
    public String registerUser(UserDto userDto, Model model) {
        boolean saved = curdService.saveUser(userDto);
        if (saved) {
            model.addAttribute("successMsg", "Registration Successful!");
            return "login";
        }
        model.addAttribute("errorMsg", "Registration Failed. Email might already exist.");
        return "signup";
    }

    @PostMapping("/doLogin")
    public String doLogin(@RequestParam String email, @RequestParam String password, Model model) {
        boolean isValid = curdService.loginUser(email, password);
        if (isValid) {
            return "redirect:/readAllData"; // Redirect to your existing dashboard
        }
        model.addAttribute("error", "Invalid Email or Password");
        return "login";
    }
}