package com.jsawh.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("application----");
        return "application wellcom we ye1!";
    }
    @RequestMapping("/wh")
    public String  wh(){
        return"hello my name is wh";
    }
}
