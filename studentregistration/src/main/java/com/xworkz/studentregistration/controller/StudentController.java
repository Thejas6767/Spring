package com.xworkz.studentregistration.controller;


import com.xworkz.studentregistration.dto.CourseService;
import com.xworkz.studentregistration.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/registerStudent")
    public String registerStudent(StudentDto studentDto) {
        courseService.verifyCourse();

        System.out.println("Student Name: " + studentDto.getStudentName());
        System.out.println("Email: " + studentDto.getEmail());

        return "student";
    }
}