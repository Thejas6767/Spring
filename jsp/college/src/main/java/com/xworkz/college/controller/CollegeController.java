package com.xworkz.college.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/college")
public class CollegeController {

    public CollegeController() {
        System.out.println("CollegeController object created");
    }

    @PostMapping("/add")
    public String addCollege() {
        return "collegeAdd";
    }

    @PostMapping("/update")
    public String updateCollege() {
        return "collegeUpdate";
    }

    @PostMapping("/remove")
    public String removeCollege() {
        return "collegeRemove";
    }

    @PostMapping("/details")
    public String collegeDetails() {
        return "collegeDetails";
    }
}
