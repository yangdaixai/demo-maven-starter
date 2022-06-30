package com.example.starterdev.demostarterdev.service;

import org.springframework.stereotype.Service;

/**
 * @author yangshengwei_zidie
 * @description
 * @date 2022-06-28-5:34 PM
 */
@Service
public class StarterDevTest {

    public String test(String str) {
        System.out.println("str:"+str);
        return str+"test";
    }
}
