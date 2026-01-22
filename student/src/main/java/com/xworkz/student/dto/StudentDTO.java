package com.xworkz.student.dto;



import org.springframework.stereotype.Component;

@Component
public class StudentDTO {

    private int id;
    private String name;

    public StudentDTO() {
        System.out.println("this is StudentDTO constructor");
    }

    public StudentDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void dtoMethod() {
        System.out.println("this is StudentDTO method logic");
    }
}
