package com.xworkz.examresult.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam")
public class ExamController {

    public ExamController() {
        System.out.println("ExamController object created");
    }

    @PostMapping("/register")
    public String registerExam() {
        return "examRegister";
    }

    @PostMapping("/update")
    public String updateExam() {
        return "examUpdate";
    }

    @PostMapping("/result")
    public String viewResult() {
        return "examResult";
    }

    @PostMapping("/hallticket")
    public String hallTicket() {
        return "examHallTicket";
    }
}
