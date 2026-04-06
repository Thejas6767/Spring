package com.xworkz.signinandsignup.service;

import com.xworkz.signinandsignup.dto.SignUpDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SignUpValidation {

    public Map<String, String> validate(SignUpDto dto) {

        Map<String, String> errors = new HashMap<>();

        if (dto.getName() == null || !dto.getName().matches("[A-Za-z]+")) {
            errors.put("nameError", "Name should contain only letters");
        }

        if (dto.getUsername() == null || !dto.getUsername().matches("[A-Za-z]+")) {
            errors.put("usernameError", "Username should contain only letters");
        }

        if (dto.getPassword() == null || dto.getPassword().length() < 4) {
            errors.put("passwordError", "Password must be 4+ chars");
        }

        if (!dto.getPassword().equals(dto.getConfirmPassword())) {
            errors.put("confirmError", "Passwords not matching");
        }

        return errors;
    }
}
