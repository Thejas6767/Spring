package com.xworkz.curd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int id;
    private String name;
    private String email;
    private String gender;
    private int age;
    private String address;
    private String password;
    private String role;   // ADMIN / USER
}
