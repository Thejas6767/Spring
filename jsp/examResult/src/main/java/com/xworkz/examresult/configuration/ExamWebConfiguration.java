package com.xworkz.examresult.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.examApp")
public class ExamWebConfiguration {

    public ExamWebConfiguration() {
        System.out.println("ExamWebConfiguration created");
    }

    @Bean
    public ViewResolver viewResolver() {
        return new InternalResourceViewResolver("/", ".jsp");
    }
}

