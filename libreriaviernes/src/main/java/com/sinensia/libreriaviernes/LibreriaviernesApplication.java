package com.sinensia.libreriaviernes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.sinensia.controlador", "com.sinensia.service" })
public class LibreriaviernesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaviernesApplication.class, args);
	}

	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}

}
