package com.xworkz.bank.dto;

import java.util.Objects;

public class EmailDto {

    private String email;

    public EmailDto(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmailDto{" +
                "email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailDto emailDto = (EmailDto) o;
        return Objects.equals(email, emailDto.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}


