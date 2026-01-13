package com.xworkz.complex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ThirdFloorController {
    public ThirdFloorController(){
        System.out.println("this is Third Floor controller");
    }
    @GetMapping("/3rd Floor")
    public String complexController(){
        System.out.println(" this is 3rd controller method");
        return "thirdfloor.jsp";
    }

}

