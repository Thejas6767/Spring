package com.xworkz.studentregistration.dto;


public class StudentDto {
    private String studentName;
    private String course;
    private String email;
    private Long mobileNumber;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;

    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(Long mobileNumber) { this.mobileNumber = mobileNumber; }
}