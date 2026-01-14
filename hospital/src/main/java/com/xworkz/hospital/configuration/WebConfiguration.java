package com.xworkz.hospital.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.railwaystation")
public class WebConfiguration {


    public WebConfiguration() {
        System.out.println("this is WebConfiguration class");
    }

}

