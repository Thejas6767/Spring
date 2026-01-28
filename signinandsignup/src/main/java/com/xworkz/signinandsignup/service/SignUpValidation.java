package com.xworkz.signinandsignup.service;

import com.xworkz.signinandsignup.dto.SignUpDto; // Essential Import
import org.springframework.stereotype.Service;

@Service
public class SignUpValidation {
    public boolean formValidation(SignUpDto dto) {
        if (dto == null) return false;

        // If these show red, Lombok annotation processing is OFF in your IDE
        return dto.getName() != null &&
                dto.getName().length() >= 3 &&
                dto.getPassword().equals(dto.getConfirmPassword());
    }
}