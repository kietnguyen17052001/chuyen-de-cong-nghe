package com.example.deploynexus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployNexusApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeployNexusApplication.class, args);
    }
    @GetMapping
    public String homePage() {
        return new String("Home page");
    }
}
