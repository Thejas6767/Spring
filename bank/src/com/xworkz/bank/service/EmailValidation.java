package com.xworkz.bank.service;


import com.xworkz.bank.dto.EmailDto;

public class EmailValidation {

    public boolean emailValidation(EmailDto dto){
        String email = dto.getEmail();

        if (email.length()>=15 && email.length()<=30 && email.contains("@gmail.com")){
            System.out.println("Email is valid");
            return true;
        }else {
            System.out.println("Email is invalid.");
            return false;
        }

    }

}
