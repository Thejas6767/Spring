package com.xworkz.complex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FifthFloorController {
    public FifthFloorController(){
        System.out.println("this is Fifth Floor controller");
    }
    @GetMapping("/5th Floor")
    public String complexController(){
        System.out.println(" this is 5th controller method");
        return "fifth.jsp";
    }

}