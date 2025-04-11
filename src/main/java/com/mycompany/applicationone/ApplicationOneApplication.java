package com.mycompany.applicationone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationOneApplication {

	public static void main(String[] args) {
		System.out.println("Application One is starting...");
		SpringApplication.run(ApplicationOneApplication.class, args);
	}

}
