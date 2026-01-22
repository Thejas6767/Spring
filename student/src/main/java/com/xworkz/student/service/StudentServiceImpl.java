package com.xworkz.student.service;



import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    public StudentServiceImpl() {
        System.out.println("this is StudentService implementation class");
    }

    @Override
    public void register(String name) {
        System.out.println("this is save method in Service: " + name);
    }
}