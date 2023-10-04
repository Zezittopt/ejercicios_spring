package com.sinensia.claudio.apiproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.sinensia.claudio.apiproductos.repository")
@EntityScan(basePackages = "com.sinensia.claudio.apiproductos.model")
@SpringBootApplication(scanBasePackages = {"com.sinensia.claudio.apiproductos.controller", "com.sinensia.claudio.apiproductos.service"})
public class ApiproductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiproductosApplication.class, args);
	}

}
