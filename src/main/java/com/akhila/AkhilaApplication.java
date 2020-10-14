package com.akhila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AkhilaApplication {
    public static void main(String[] args) {
        SpringApplication.run(AkhilaApplication.class, args);
    }
}
