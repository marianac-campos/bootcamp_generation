package br.org.generation.storyStick.controller;

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

import br.org.generation.storyStick.model.Produto;
import br.org.generation.storyStick.repository.ProdutoRepositorio;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoControle {
	
	@Autowired
	private ProdutoRepositorio repositorio;
	
	@GetMapping
	public ResponseEntity<List<Produto>> GetAll(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> GetById(@PathVariable long id){
		return repositorio.findById(id)
		.map(resp -> ResponseEntity.ok(resp))
		.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produto>> GetByNome(@PathVariable String nome){
		return ResponseEntity.ok(repositorio.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK).body(repositorio.save(produto));
	}
	
	@DeleteMapping
	public void delete(@PathVariable long id){
		repositorio.deleteById(id);
	}
}
