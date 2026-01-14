package com.xworkz.hospital.controller;

import com.xworkz.hospital.dto.HospitalDTO;
import com.xworkz.hospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HospitalController {

    @Autowired
    private HospitalDTO hospitalDTO;

    @Autowired
    private HospitalService hospitalService;

    public HospitalController() {
        System.out.println("this is HospitalController constructor");
    }

    @GetMapping("/hospitalRegistration")
    public String registerHospital(@RequestParam String name) {
        hospitalDTO.dtoMethod();
        hospitalService.register(name);

        System.out.println("this is controller method for: " + name);
        return "hospital.jsp";
    }
}