package com.xworkz.hospital.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hospital")
public class HospitalController {

    public HospitalController() {
        System.out.println("HospitalController object created");
    }

    @PostMapping("/admit")
    public String admitPatient() {
        return "hospitalAdmit";
    }

    @PostMapping("/update")
    public String updatePatient() {
        return "hospitalUpdate";
    }

    @PostMapping("/discharge")
    public String dischargePatient() {
        return "hospitalDischarge";
    }

    @PostMapping("/details")
    public String patientDetails() {
        return "hospitalDetails";
    }
}

