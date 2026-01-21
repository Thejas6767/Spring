package com.xworkz.bank.dto;

import java.util.Objects;

public class AgeDto {

    private int age;

    public AgeDto(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AgeDto{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgeDto ageDto = (AgeDto) o;
        return age == ageDto.age;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age);
    }
}
