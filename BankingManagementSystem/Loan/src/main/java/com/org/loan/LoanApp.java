package com.org.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages="com.org.loan")
@Configuration
@EnableAutoConfiguration
public class LoanApp {

	public static void main(String[] args) {
		SpringApplication.run(LoanApp.class, args);
	}

}
