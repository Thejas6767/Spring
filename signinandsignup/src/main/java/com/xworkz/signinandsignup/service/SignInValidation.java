package com.xworkz.signinandsignup.service;

import com.xworkz.signinandsignup.repository.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInValidation {

    @Autowired
    private Database database;

    public boolean validate(String username, String password) {

        String dbPassword = database.getPasswordByUsername(username);

        if (dbPassword == null) return false;

        return dbPassword.equals(password);
    }
}
