package com.xworkz.project_modules.entity;


import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "user_details_tb")
@Data
@NamedQuery(name = "loginCheck", query = "select u from UserEntity u where u.email = :email and u.password = :pass")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String gender;
    private int age;
    private String address;
    private String password;
}
