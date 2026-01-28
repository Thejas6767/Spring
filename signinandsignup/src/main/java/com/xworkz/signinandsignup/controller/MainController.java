package com.xworkz.signinandsignup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() { return "index"; }



        @GetMapping("/signin")
        public String signInPage() {
            return "signin";
        }

    @GetMapping("/signup")
    public String signUpPage() {
        return "signup";
    }
    @PostMapping("/login")
    public String processLogin(@RequestParam String email, @RequestParam String password) {
        System.out.println("Login attempt from: " + email);

        return "redirect:/";
    }

    @PostMapping("/register")
    public String register(@RequestParam String email, @RequestParam String password) {
        System.out.println("Registering: " + email);
        return "signin";
    }
}