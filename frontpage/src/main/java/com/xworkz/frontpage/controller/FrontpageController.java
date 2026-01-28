package com.xworkz.frontpage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FrontpageController {
    @PostMapping("/elctionDetails")
    public String elctionDetails(){

        return "election";

    }
}
