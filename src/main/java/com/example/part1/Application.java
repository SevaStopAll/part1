package com.example.part1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

    @SpringBootApplication
    @EnableScheduling
    public class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class);
            System.out.println("Hello");
        }
    }
