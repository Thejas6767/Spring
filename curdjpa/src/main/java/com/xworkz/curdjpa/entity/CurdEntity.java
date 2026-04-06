package com.xworkz.curdjpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "curd_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="readAll", query="select c from CurdEntity c")
public class CurdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    private int age;
    private String clgName;
    private long ph;
}