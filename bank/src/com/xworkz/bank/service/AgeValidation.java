package com.xworkz.bank.service;


import com.xworkz.bank.dto.AgeDto;

public class AgeValidation {

    public boolean ageValidation(AgeDto dto){
        int age = dto.getAge();

        if (age>=18 && age<=60){
            System.out.println("Valid age");
            return true;
        }else {
            System.out.println("Invalid age");
            return false;
        }

    }

}