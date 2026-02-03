package com.xworkz.hostel.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hostel")
public class HostelController {

    public HostelController() {
        System.out.println("HostelController object created");
    }

    @PostMapping("/admit")
    public String admitStudent() {
        return "hostelAdmit";
    }

    @PostMapping("/update")
    public String updateHostel() {
        return "hostelUpdate";
    }

    @PostMapping("/vacate")
    public String vacateHostel() {
        return "hostelVacate";
    }

    @PostMapping("/details")
    public String hostelDetails() {
        return "hostelDetails";
    }
}
