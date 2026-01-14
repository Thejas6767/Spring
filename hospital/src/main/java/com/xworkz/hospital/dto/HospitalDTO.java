package com.xworkz.hospital.dto;

import org.springframework.stereotype.Component;

@Component
public class HospitalDTO {
    private int id;
    private String name;

    public HospitalDTO() {
        System.out.println("this is HospitalDTO constructor");
    }

    public HospitalDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void dtoMethod() {
        System.out.println("this is HospitalDTO method logic");
    }
}
