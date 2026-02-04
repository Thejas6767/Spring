package com.xworkz.jobfair.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="job_fair_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="findById",query="select jf From JobFairEntity jf where jf.id =:idby")
@NamedQuery(name="findByNameAndid", query="select jf.personAge , jf.personName from JobFairEntity jf " +
        "where jf.id =:idby and jf.personName =:personNameby")
public class JobFairEntity {
    @Id
    private  int id ;
    private String personName;
    private int personAge;


}
