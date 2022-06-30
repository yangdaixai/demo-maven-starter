package com.example.test.starter.demostarter;

import com.example.starterdev.demostarterdev.service.SchoolService;
import com.example.starterdev.demostarterdev.service.StarterDevTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoStarterApplicationTests {

    @Autowired
    SchoolService schoolService;

    @Test
    void contextLoads() {
    String str = schoolService.schoolTest("12345");
        System.out.println("str:"+str);
    }
}
