package com.org.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@ComponentScan(basePackages="com.org.user")
@Configuration
@EnableAutoConfiguration
public class UserApp {

	public static void main(String[] args) {
		SpringApplication.run(UserApp.class, args);
	}
	
}
