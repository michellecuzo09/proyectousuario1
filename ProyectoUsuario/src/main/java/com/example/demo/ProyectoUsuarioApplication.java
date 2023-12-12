package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@OpenAPIDefinition
@SpringBootApplication
public class ProyectoUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoUsuarioApplication.class, args);
	}

}
