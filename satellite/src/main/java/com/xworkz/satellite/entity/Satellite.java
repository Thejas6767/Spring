package com.xworkz.satellite.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="satellite")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Satellite {

    @Id
    private int satelliteid;
    private String satellitename;


    private int number;
    private String planet;

}
