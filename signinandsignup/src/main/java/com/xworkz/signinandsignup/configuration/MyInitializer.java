package com.xworkz.signinandsignup.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class };
    }
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}