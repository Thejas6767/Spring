package com.xworkz.college.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is webconfig");
    }
    @Bean
    public ViewResolver viewResolver(){
        System.out.println("this is view Reslover");
        return new  InternalResourceViewResolver("/",".jsp");
    }
}
