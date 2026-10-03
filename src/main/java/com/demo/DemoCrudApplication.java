package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoCrudApplication {

	public static void main(String[] args) {
        System.out.println("Application started");
		SpringApplication.run(DemoCrudApplication.class, args);

	}

}
