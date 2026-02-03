package com.xworkz.employee.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    public EmployeeController() {
        System.out.println("EmployeeController object created");
    }

    @PostMapping("/add")
    public String addEmployee() {
        return "empAdd";
    }

    @PostMapping("/update")
    public String updateEmployee() {
        return "empUpdate";
    }

    @PostMapping("/delete")
    public String deleteEmployee() {
        return "empDelete";
    }

    @PostMapping("/view")
    public String viewEmployee() {
        return "empView";
    }
}

