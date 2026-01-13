package com.xworkz.complex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ComplexController {
    public ComplexController(){
        System.out.println("this is Complex controller");
    }
    @GetMapping("/1st Floor")
    public String complexController(){
        System.out.println(" this is controller method");
        return "firstfloor.jsp";
    }

}