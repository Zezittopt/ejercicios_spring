package com.sinensia.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.sinensia.model")
@EnableJpaRepositories(basePackages = "com.sinensia.repository")
@SpringBootApplication(scanBasePackages = { "com.sinensia.controller", "com.sinensia.service" })
public class CursoApplication {

	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}

}
