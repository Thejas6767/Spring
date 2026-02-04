package com.xworkz.ceo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "ceo_tb")
public class CeoEntity {

    @Id
    private int CeoId;
    private String CeoName;
   private String CompanyName;
   private double NetWorth;
}
