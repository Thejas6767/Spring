package com.xworkz.hospital.service;

import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService {
    public HospitalServiceImpl() {
        System.out.println("this is HospitalService implementation class");
    }

    @Override
    public void register(String name) {
        System.out.println("this is save method in Service: " + name);
    }
}
