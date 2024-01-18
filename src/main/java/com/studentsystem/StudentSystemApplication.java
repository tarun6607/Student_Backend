/**
 * Declares the root package for the application. This package contains the main Spring Boot application class and component scan configuration.
*/
/*
 * We are using POTMAN for API Handling by the help of GET and POST Request
 */
package com.studentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan(basePackages = "com.studentsystem")
public class StudentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSystemApplication.class, args);
	}

}
