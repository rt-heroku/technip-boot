package com.technipfmc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Running demo app");
		SpringApplication.run(DemoApplication.class, args);
	}
}
