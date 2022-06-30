package com.example.test.starter.demostarter.controller;

import com.example.starterdev.demostarterdev.service.StarterDevTest;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangshengwei_zidie
 * @description
 * @date 2022-06-29-5:44 PM
 */

public class StarterTest {

    @Autowired
    StarterDevTest starterDevTest;

    public void test() {
        starterDevTest.test("123");
    }

}
