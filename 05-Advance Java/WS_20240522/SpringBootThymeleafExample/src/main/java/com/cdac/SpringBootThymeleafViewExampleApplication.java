package com.cdac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class SpringBootThymeleafViewExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafViewExampleApplication.class, args);
	}
}