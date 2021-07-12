package br.org.generation.storyStick.controller;

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

import br.org.generation.storyStick.model.LoginUsuario;
import br.org.generation.storyStick.model.Usuario;
import br.org.generation.storyStick.repository.UsuarioRepositorio;
import br.org.generation.storyStick.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioControle {
	
	@Autowired
	private UsuarioRepositorio userRepository;
	
	@Autowired
	private UsuarioService userService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Usuario>> getAll() {
		return ResponseEntity.ok(userRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getById(@PathVariable long id){
		return userRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());				
	}

	@PostMapping("/logar")
	public ResponseEntity<LoginUsuario> autenticationUsuario(@RequestBody Optional<LoginUsuario> usuario) {
		return userService.Logar(usuario)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario) {
		Optional<Usuario> novoUsuario = userService.cadastrarUsuario(usuario);
		try {
				return ResponseEntity.ok(novoUsuario.get());
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
		
	}
	
	@PutMapping("/alterar")
	public ResponseEntity<Usuario> putUsuario(@RequestBody Usuario usuario){
		Optional<Usuario> updateUsuario = userService.atualizarUsuario(usuario);
		try {
			return ResponseEntity.ok(updateUsuario.get());
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
}
