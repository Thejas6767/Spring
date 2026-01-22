package com.xworkz.student.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.student")
public class WebConfiguration {
    public WebConfiguration() {
        System.out.println("this is web configuration class");
    }

}