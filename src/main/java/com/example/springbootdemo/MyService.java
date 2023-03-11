package com.example.springbootdemo;

import org.springframework.stereotype.Service;

@Service
public class MyService {

  public String sayHi(String name) {
    return "hello " + name;
  }
}
