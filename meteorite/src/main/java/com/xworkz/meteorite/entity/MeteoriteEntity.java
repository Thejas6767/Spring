package com.xworkz.meteorite.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="meteorite_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeteoriteEntity {

    @Id
    private int id;
    private String name;
    private double mass;
    private String composition;
}