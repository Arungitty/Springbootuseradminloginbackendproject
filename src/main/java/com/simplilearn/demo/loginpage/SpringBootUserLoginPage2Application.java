package com.simplilearn.demo.loginpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.demo.loginpage")
public class SpringBootUserLoginPage2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUserLoginPage2Application.class, args);
		System.out.println("My spring boot application is working");
	}

}
