package com.jianjoy.web.demo;

import com.jianjoy.web.demo.controller.GreetingController;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;


@SpringBootTest
//启动上下文
public class GreetingControllerTest {


    @Autowired
    private GreetingController controller;


    @Test
    public void testContextLoads(){
        Assertions.assertNotNull(controller);
    }

    @Test
    public void testGreeting(){
        String name = "testName01";
        assertThat(controller.greeting(name).getContent(),Matchers.containsString("Hello,"+name+"!"));
    }

}
