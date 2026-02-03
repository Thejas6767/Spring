package com.xworkz.vehicle.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {

    public VehicleController() {
        System.out.println("VehicleController object created");
    }

    @PostMapping("/register")
    public String registerVehicle() {
        return "vehicleRegister";
    }

    @PostMapping("/update")
    public String updateVehicle() {
        return "vehicleUpdate";
    }

    @PostMapping("/delete")
    public String deleteVehicle() {
        return "vehicleDelete";
    }

    @PostMapping("/details")
    public String vehicleDetails() {
        return "vehicleDetails";
    }
}

