package com.xworkz.flight.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.flight")
public class WebConfiguration {


    public WebConfiguration() {
        System.out.println("this is WebConfiguration class");
    }

}

