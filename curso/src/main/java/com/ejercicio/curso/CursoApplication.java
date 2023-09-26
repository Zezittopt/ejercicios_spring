package com.ejercicio.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages= {"com.ejercicio.controller","com.ejercicio.service"})
public class CursoApplication {

	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}

}
