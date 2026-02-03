package com.xworkz.jobfair.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="job_fair_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="findById",query="select JobFairEntity From JobFairEntity   ")
public class JobFairEntity {
    @Id
    private  int id ;
    private String personName;
    private int personAge;
    @Column(name="person_number")
    private Long personNumber;

}
