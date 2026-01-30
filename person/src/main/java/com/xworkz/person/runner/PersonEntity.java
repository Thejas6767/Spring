package com.xworkz.person.runner;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person_tb")
@Data
@AllArgsConstructor
public class PersonEntity {

    @Id
    private int id;
    private String personName;
    private int personAge;

}
