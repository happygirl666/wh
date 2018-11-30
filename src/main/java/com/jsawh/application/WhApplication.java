package com.jsawh.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jsawh.web")
public class WhApplication {
    public static void main(String[] args) {
        SpringApplication.run(WhApplication.class, args);
    }
}
