package com.xworkz.signinandsignup.controller;

import com.xworkz.signinandsignup.dto.SignUpDto;
import com.xworkz.signinandsignup.repository.Database;
import com.xworkz.signinandsignup.service.SignInValidation;
import com.xworkz.signinandsignup.service.SignUpValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @Autowired private Database database;
    @Autowired private SignUpValidation signUpValidation;
    @Autowired private SignInValidation signInValidation;

    @PostMapping("/signup")
    public String signup(SignUpDto dto, Model model) {
        if (!signUpValidation.formValidation(dto)) {
            model.addAttribute("error", "Invalid Details!");
            return "signup";
        }
        if (database.save(dto)) {
            model.addAttribute("name", dto.getName());
            return "signUpResponse";
        }
        return "signup";
    }

    @PostMapping("/signin")
    public String signin(@RequestParam String username, @RequestParam String password, Model model) {
        if (signInValidation.validate(username, password)) {
            model.addAttribute("user", username);
            return "signInResponse";
        }
        model.addAttribute("error", "Login Failed!");
        return "signin";
    }
}