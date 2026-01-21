package com.xworkz.bank.dto;

import java.util.Objects;

public class PasswordDto {

    private String  password;
    private String  confirmPassword;

    public PasswordDto(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "PasswordDto{" +
                "password=" + password +
                ", confirmPassword=" + confirmPassword +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordDto that = (PasswordDto) o;
        return Objects.equals(password, that.password) && Objects.equals(confirmPassword, that.confirmPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, confirmPassword);
    }
}
