package com.org.loan.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket docuket( ) {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.org.loan.controller")).paths(PathSelectors.any())
                .build()
                .apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Address Book Api", "Banking Management System","1.0", "Free to use",
				new springfox.documentation.service.Contact("Ramesh", "http://springframework.com", "as@as.com"),
				"API License", "http://springframework.com",
				Collections.emptyList());
	}
}
