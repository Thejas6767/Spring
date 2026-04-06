package com.xworkz.project_modules.dto;


import lombok.Data;

@Data
public class UserDto {
    private String name;
    private String email;
    private String gender;
    private int age;
    private String address;
    private String password;
    private String confirmPassword;
}
