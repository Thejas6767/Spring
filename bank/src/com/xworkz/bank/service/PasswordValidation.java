package com.xworkz.bank.service;


import com.xworkz.bank.dto.PasswordDto;

public class PasswordValidation {

    public boolean passwordValidation(PasswordDto dto) {
        String password = dto.getPassword();
        String confirmPass = dto.getConfirmPassword();

        if (password != null
                && confirmPass != null
                && password.length() >= 8
                && Character.isUpperCase(password.charAt(0))
                && password.replaceAll("[a-zA-Z0-9]", "").length() >= 2
                && password.equals(confirmPass)) {

            System.out.println("Password and Confirm Password are valid");
            return true;

        } else {

            System.out.println("Invalid password. Password must start with an uppercase letter, " +
                    "contain at least 8 characters, and include at least 1 special characters.");
            return false;
        }


    }

}