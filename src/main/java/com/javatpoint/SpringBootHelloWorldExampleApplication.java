package com.javatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootHelloWorldExampleApplication {
    public static void main(String[] args) {
        com.example.serverA.demoA.DemoAApplication demoAApplication;
        com.example.serverB.demoB.DemoBApplication demoBApplication;

        SpringApplication.run(SpringBootHelloWorldExampleApplication.class, args);
    }
}