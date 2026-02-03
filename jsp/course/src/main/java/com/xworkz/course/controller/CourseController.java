package com.xworkz.course.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {

    public CourseController() {
        System.out.println("CourseController object created");
    }

    @PostMapping("/add")
    public String addCourse() {
        return "courseAdd";
    }

    @PostMapping("/update")
    public String updateCourse() {
        return "courseUpdate";
    }

    @PostMapping("/delete")
    public String deleteCourse() {
        return "courseDelete";
    }

    @PostMapping("/list")
    public String listCourses() {
        return "courseList";
    }
}

