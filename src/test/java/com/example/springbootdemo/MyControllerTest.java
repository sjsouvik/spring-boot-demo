package com.example.springbootdemo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
//@ExtendWith(SpringExtension.class)
class MyControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void testMyController() {
    String expected = "hello world";
//    mockMvc.perform(get("/hello")).contentType(MediaType.APPLICATION_JSON).andExpect(status().isOk()).andExpect(content().string(expected));
  }
}