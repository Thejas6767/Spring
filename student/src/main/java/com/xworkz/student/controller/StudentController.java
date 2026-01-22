package com.xworkz.student.controller;


import com.xworkz.student.dto.StudentDTO;
import com.xworkz.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentDTO studentDTO;

    @Autowired
    private StudentService studentService;

    public StudentController() {
        System.out.println("this is StudentController constructor");
    }

    @GetMapping("/studentRegistration")
    public String registerStudent(@RequestParam String name) {

        studentDTO.dtoMethod();
        studentService.register(name);

        System.out.println("this is controller method for: " + name);
        return "student.jsp";
    }
}
