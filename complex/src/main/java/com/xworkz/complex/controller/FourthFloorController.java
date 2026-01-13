package com.xworkz.complex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FourthFloorController {
    public FourthFloorController(){
        System.out.println("this is Fourth Floor controller");
    }
    @GetMapping("/4th Floor")
    public String complexController(){
        System.out.println(" this is 4th controller method");
        return "fourthfloor.jsp";
    }

}

