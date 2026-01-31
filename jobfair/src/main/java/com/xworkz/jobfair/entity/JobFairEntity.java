package com.xworkz.jobfair.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_fair_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobFairEntity {
    @Id
    private  int id ;
    private String personName;
    private int personAge;
    @Column(name="person_number")
    private Long personNumber;

}
