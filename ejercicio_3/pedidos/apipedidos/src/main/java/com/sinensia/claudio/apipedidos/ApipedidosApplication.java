package com.sinensia.claudio.apipedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.sinensia.claudio.apipedidos.repository")
@EntityScan(basePackages = "com.sinensia.claudio.apipedidos.model")
@SpringBootApplication(scanBasePackages = {"com.sinensia.claudio.apipedidos.controller", "com.sinensia.claudio.apipedidos.service"})
public class ApipedidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApipedidosApplication.class, args);
	}

}
