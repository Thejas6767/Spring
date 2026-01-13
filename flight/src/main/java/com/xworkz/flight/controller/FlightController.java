package com.xworkz.flight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.flight.dto.FlightDTO;
import com.xworkz.flight.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
@RequestMapping("/")
public class FlightController {

    @Autowired
    private FlightService flightService;

    public FlightController() {
        System.out.println("Flight Controller created");
    }

    @GetMapping("/flight")
    public String railWayStation(FlightDTO dto, org.springframework.ui.Model model) {
        System.out.println("Controller method called with DTO: " + dto);

        flightService.validateAndSave(dto);
   model.addAttribute("flightData", dto);

        return "flight.jsp";
    }

    }


