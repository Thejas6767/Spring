package com.xworkz.marriage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marriageEntity")
@Data
@AllArgsConstructor
public class MarriageEntity {
    private String personName;
    @Id
    private int id;

    private int personAge;

}
