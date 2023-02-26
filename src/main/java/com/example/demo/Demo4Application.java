package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class Demo4Application {
    @GetMapping("/home ")
    public String Message() {
        return "Welcome";
    }
    public static void main(String[] args) {
        SpringApplication.run(Demo4Application.class, args);
    }

}
