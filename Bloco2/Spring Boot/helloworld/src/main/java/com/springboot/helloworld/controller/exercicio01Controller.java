package com.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio01")
public class exercicio01Controller {
	
	@GetMapping
	public String exercicio01(){
		return "HABILIDADES: Atenção aos detalhes.\nMENTALIDADES: Mentalidade de crescimento e persistência.";
	}
}
