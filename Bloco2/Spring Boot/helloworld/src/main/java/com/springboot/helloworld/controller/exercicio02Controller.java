package com.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio02")
public class exercicio02Controller {
	
	@GetMapping
	public String exercicio02(){
		return "OBJETIVOS DE APRENDIZAGEM PARA SEMANA DO DIA 23/06/2021\n=> Aprender mais sobre Spring;\n=> Colocar em prática o uso das outras camadas;"
				+ "\n=> Aprender e decorar os conceitos aprendidos.";
	}
}
