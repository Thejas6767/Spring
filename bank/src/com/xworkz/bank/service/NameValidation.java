package com.xworkz.bank.service;


import com.xworkz.bank.dto.NameDto;

public class NameValidation {

    public boolean nameValidation(NameDto dto){
        String name = dto.getName();

        if (name.length() >= 3 && name.length() <= 10 && name.matches("[a-zA-Z]+")) {
            System.out.println("Valid name");
            return true;
        }
        else {
            System.out.println("Invalid name");
            return false;
        }

    }

}