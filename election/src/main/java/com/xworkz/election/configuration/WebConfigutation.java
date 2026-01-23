package com.xworkz.election.configuration;

import com.xworkz.election.dto.ElectionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.election")
public class WebConfigutation {
    public WebConfigutation(){

        System.out.println("this is webconfiguration");
    }
    @Bean
   public ViewResolver ViewReslover(){
        return new InternalResourceViewResolver("/",".jsp");
   }
   @Bean
    public ElectionDto electionDto(){
       System.out.println("this elsction dto regisatration");
        return new ElectionDto();
   }
}
