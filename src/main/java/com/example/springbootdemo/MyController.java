package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyController {


  private MyService myService = new MyService();

  @GetMapping
  public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
    return myService.sayHi(name);
  }
}
