package br.org.generation.blogpessoal.controller;

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

import br.org.generation.blogpessoal.model.Tema;
import br.org.generation.blogpessoal.repository.TemaRepositorio;

@RestController
@RequestMapping("/tema")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TemaControle {
	
	//dependency injection
	@Autowired //Transfer responsibility to Spring for instantiating the object
	public TemaRepositorio repositorio;
	
	@GetMapping
	public ResponseEntity<List<Tema>> GetAll(){ 
		return ResponseEntity.ok(repositorio.findAll()); 
	}
	
	//Get for search by ID using Lambda
	@GetMapping("/{id}") //End-point search ID
	public ResponseEntity<Tema> GetById(@PathVariable long id){
		return repositorio.findById(id)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}
	
	//Get for search by description
	@GetMapping("/descricao/{descricao}") //End-point search description
	public ResponseEntity<List<Tema>> GetByDescricao(@PathVariable String descricao){
		return ResponseEntity.ok(repositorio.findAllByDescricaoContainingIgnoreCase(descricao));
	}
		
	//Create a new theme
	@PostMapping
	public ResponseEntity<Tema> post(@RequestBody Tema tema){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(tema));
	}
		
	//Edit a theme
	@PutMapping
	public ResponseEntity<Tema> put(@RequestBody Tema tema){
		return ResponseEntity.status(HttpStatus.OK).body(repositorio.save(tema));
	}
		
	//Delete the line of a ID
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id){
		repositorio.deleteById(id);
	}
}
