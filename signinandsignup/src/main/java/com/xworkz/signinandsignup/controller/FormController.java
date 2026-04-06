package com.xworkz.signinandsignup.controller;

import com.xworkz.signinandsignup.dto.SignUpDto;
import com.xworkz.signinandsignup.repository.Database;
import com.xworkz.signinandsignup.service.SignInValidation;
import com.xworkz.signinandsignup.service.SignUpValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class FormController {

    @Autowired
    private Database database;

    @Autowired
    private SignUpValidation signUpValidation;

    @Autowired
    private SignInValidation signInValidation;

    @GetMapping("/")
    public String home() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(SignUpDto dto, Model model) {

        Map<String, String> errors = signUpValidation.validate(dto);

        if (!errors.isEmpty()) {
            model.addAllAttributes(errors);
            model.addAttribute("dto", dto);
            return "signup";
        }

        if (database.save(dto)) {
            model.addAttribute("name", dto.getName());
            return "signUpResponse";
        }

        model.addAttribute("error", "DB Error");
        return "signup";
    }

    @PostMapping("/signin")
    public String signin(@RequestParam String username,
                         @RequestParam String password,
                         Model model) {

        if (username.matches(".*\\d.*")) {
            model.addAttribute("userError", "Username should not contain numbers");
            return "signin";
        }

        if (signInValidation.validate(username, password)) {
            model.addAttribute("user", username);
            return "signInResponse";
        }

        model.addAttribute("error", "Invalid username or password");
        return "signin";
    }

}
