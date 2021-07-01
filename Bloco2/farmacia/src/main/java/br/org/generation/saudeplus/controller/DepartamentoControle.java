package br.org.generation.saudeplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.saudeplus.model.Departamento;
import br.org.generation.saudeplus.repository.DepartamentoRepositorio;

@RestController
@RequestMapping("/departamentos")
@CrossOrigin("*")
public class DepartamentoControle {
	
	@Autowired
	public DepartamentoRepositorio departamento;
	
	@GetMapping
	public ResponseEntity<List<Departamento>> getAll(){
		return ResponseEntity.ok(departamento.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Departamento> getById(@PathVariable long id){
		return departamento.findById(id)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/categoria/{categoria}")
	public ResponseEntity<List<Departamento>> getByNome(@PathVariable String categoria){
		return ResponseEntity.ok(departamento.findAllByCategoriaContainingIgnoreCase(categoria));
	}
	
	@PostMapping
	public ResponseEntity<Departamento> post(@RequestBody Departamento criar){
		return ResponseEntity.status(HttpStatus.CREATED)
			.body(departamento.save(criar));
	}
	
	@PutMapping
	public ResponseEntity<Departamento> put(@RequestBody Departamento editar){
		return ResponseEntity.status(HttpStatus.OK)
			.body(departamento.save(editar));
	}
	
	@DeleteMapping("/deletar/{id}")
	public void getId(@PathVariable long id){
		departamento.deleteById(id);
	}
}
