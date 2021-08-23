package com.lista1.lista1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio2")

public class Exercicio2Controller {
	
	@GetMapping
	public String exercicio2 () {
		return "Nesta semana, pretendo me familiarizar com o Spring Boot e outros conhecimentos de Desenvolvimento Web.";
	}

}
