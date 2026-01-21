package com.xworkz.college.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CollegeController {

    public CollegeController(){
        System.out.println("thsi is CollegeController");
    }
    @GetMapping("/collageDetails")
    public String collageDetails(@RequestParam String name){
        System.out.println("this is conrolrlt class ="+name);
        return "collage";
    }
    @GetMapping("/collageDetail")
    public String collageDetail(@RequestParam String name){
        System.out.println("this is conrolrlt class ="+name);
        return "school";
    }
}
