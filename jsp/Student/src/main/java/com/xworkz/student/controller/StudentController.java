package com.xworkz.student.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    public StudentController() {
        System.out.println("StudentController object created");
    }

    @PostMapping("/register")
    public String registerStudent() {
        return "studentRegister";
    }

    @PostMapping("/update")
    public String updateStudent() {
        return "studentUpdate";
    }

    @PostMapping("/remove")
    public String removeStudent() {
        return "studentRemove";
    }

    @PostMapping("/details")
    public String studentDetails() {
        return "studentDetails";
    }
}

