package com.xworkz.complex.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.complex")
public class WebConfiguration {


    public WebConfiguration() {
        System.out.println("this is WebConfiguration class");
    }

}