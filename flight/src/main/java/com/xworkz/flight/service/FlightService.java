package com.xworkz.flight.service;


import com.xworkz.flight.dto.FlightDTO;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    public boolean validateAndSave(FlightDTO dto) {
        System.out.println("Service received DTO: " + dto);
        return true;
    }
}
