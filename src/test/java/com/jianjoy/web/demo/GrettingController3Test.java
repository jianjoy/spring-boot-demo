package com.jianjoy.web.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
//不启动服务器，使用mock进行http请求，启动了完整的spring应用程序上下文，但没有启动服务器
public class GrettingController3Test {


    @Autowired
    private MockMvc mockMvc;


    @Test
    public void greeting() throws Exception {
        this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Hello,World!")));
    }

}
