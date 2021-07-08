package br.org.generation.blogpessoal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.blogpessoal.model.ConectarUsuario;
import br.org.generation.blogpessoal.model.Usuario;
import br.org.generation.blogpessoal.repository.UsuarioRepositorio;
import br.org.generation.blogpessoal.service.UsuarioServico;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioControle {
	
	//dependency injection
	@Autowired
	private UsuarioRepositorio usuarioRepository;
	
	@Autowired
	private UsuarioServico usuarioService;
	
	
	//CRUDS
	@GetMapping("/todos")
	public ResponseEntity<List<Usuario>> getAll() {
		return ResponseEntity.ok(usuarioRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getById(@PathVariable long id) {
		return usuarioRepository.findById(id)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());				
	}
	
	@PostMapping("/logar")
	public ResponseEntity<ConectarUsuario> autenticationUsuario(@RequestBody Optional<ConectarUsuario> usuariologin) {
		return usuarioService.Logar(usuariologin)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
		
		Optional<Usuario> newUser = usuarioService.cadastrarUsuario(usuario);
		try {
			return ResponseEntity.ok(newUser.get());
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@PutMapping("/alterar")
	public ResponseEntity<Usuario> alterarUsuario(@RequestBody Usuario usuario) {
		
		Optional<Usuario> updateUser = usuarioService.atualizarUsuario(usuario); 
		try {
			return ResponseEntity.ok(updateUser.get());
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
}
