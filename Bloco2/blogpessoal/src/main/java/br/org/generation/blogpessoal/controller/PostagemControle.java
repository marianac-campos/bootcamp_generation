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

import br.org.generation.blogpessoal.model.Postagem;
import br.org.generation.blogpessoal.repository.PostagemRepositorio;

//Receive requests and use the appropriate method for each one

@RestController
@RequestMapping("/postagens") //End-point 
@CrossOrigin("*") //Define where the address will come from
public class PostagemControle {

	//dependency injection
	@Autowired //Transfer responsibility to Spring for instantiating the object
	public PostagemRepositorio repositorio;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){ 
		return ResponseEntity.ok(repositorio.findAll()); 
	}
	
	//Get for search by ID using Lambda
	@GetMapping("/{id}") //End-point search ID
	public ResponseEntity<Postagem> GetById(@PathVariable long id){
		return repositorio.findById(id)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}
	
	//Get for search by title
	@GetMapping("/titulo/{titulo}") //End-point search title
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repositorio.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	//Create a new data 
	@PostMapping
	public ResponseEntity<Postagem> post(@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(postagem));
	}
	
	//Edit a data
	@PutMapping
	public ResponseEntity<Postagem> put(@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repositorio.save(postagem));
	}
	
	//Delete the line of a ID
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id){
		repositorio.deleteById(id);
	}
	
	
	
	
	
	
}
