package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloController {
	
	@GetMapping("/Hello")
	
	public String sayHello() {
		return "Hello World! Meu primeiro projeto Spring.";
		

	}
	
	@GetMapping("/Bye")
	public String sayBye() {
		return "Bye! Encerrando meu primeiro Projeto Spring.";
		
	}
	
}
