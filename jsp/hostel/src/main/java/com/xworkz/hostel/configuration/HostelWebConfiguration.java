package com.xworkz.hostel.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.hostelApp")
public class HostelWebConfiguration {

    public HostelWebConfiguration() {
        System.out.println("HostelWebConfiguration created");
    }

    @Bean
    public ViewResolver viewResolver() {
        return new InternalResourceViewResolver("/", ".jsp");
    }
}
