package com.xworkz.election.dto;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ElectionDto {
@PostConstruct
    public void init(){
    System.out.println("this is post const");
    }
    @PreDestroy

    public void destory(){
        System.out.println("this is destory");
    }
}
