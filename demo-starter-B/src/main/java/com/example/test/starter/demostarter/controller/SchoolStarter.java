package com.example.test.starter.demostarter.controller;


import com.example.starterdev.demostarterdev.service.SchoolService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangshengwei_zidie
 * @description
 * @date 2022-06-28-5:13 PM
 */
@Configuration
public class SchoolStarter {

    @Bean
    public SchoolService schoolService() {
       return new SchoolService();
    }


}
