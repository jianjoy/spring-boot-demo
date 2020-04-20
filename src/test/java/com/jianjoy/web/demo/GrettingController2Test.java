package com.jianjoy.web.demo;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//设置随机端口，启动服务
public class GrettingController2Test {

    @LocalServerPort
    private int port;


    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void greeting() throws Exception {
        assertThat(restTemplate.getForObject("http://localhost:" + port + "/greeting", String.class), Matchers.containsString("Hello,World!"));
    }
}
