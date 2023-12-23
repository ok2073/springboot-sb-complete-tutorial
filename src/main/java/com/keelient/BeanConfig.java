package com.keelient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.print.Doc;

@Configuration
@ComponentScan(basePackages = "com.keelient")
public class BeanConfig {

   /* @Bean
    public Doctor doctor() {
        return new Doctor();
    }*/
}
