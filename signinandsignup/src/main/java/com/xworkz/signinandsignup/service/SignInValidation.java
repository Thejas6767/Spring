package com.xworkz.signinandsignup.service;

import com.xworkz.signinandsignup.repository.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInValidation {

    @Autowired
    private Database database;

    public boolean validate(String username, String password) {
        if (username == null || password == null) return false;

        String dbPassword = database.getPasswordByUsername(username);

        if (dbPassword == null) {
            System.out.println("Sign-in failed: User not found.");
            return false;
        }

        return dbPassword.equals(password);
    }
}