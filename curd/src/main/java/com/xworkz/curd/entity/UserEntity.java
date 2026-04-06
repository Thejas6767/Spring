package com.xworkz.curd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(
        name = "findUserByEmail",
        query = "SELECT u FROM UserEntity u WHERE u.email = :email"
)

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Column(name = "email")
    private String email;

    private String gender;

    private int age;

    private String address;

    private String password;

    @Column(name = "role")
    private String role;
}