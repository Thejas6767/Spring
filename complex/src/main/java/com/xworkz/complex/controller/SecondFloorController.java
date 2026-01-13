package com.xworkz.complex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SecondFloorController {
    public SecondFloorController(){
        System.out.println("this is Second Floor controller");
    }
    @GetMapping("/2nd Floor")
    public String complexController(){
        System.out.println(" this is second controller method");
        return "secondfloor.jsp";
    }

}
