package com.xworkz.studentregistration.dto;


import org.springframework.stereotype.Component;

@Component
public class CourseService {

    public CourseService() {
        System.out.println("CourseService");
    }

    public void verifyCourse() {
        System.out.println("course availability");
    }
}