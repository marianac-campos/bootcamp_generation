package br.org.generation.storyStick.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.org.generation.storyStick.model.LoginUsuario;
import br.org.generation.storyStick.model.Usuario;
import br.org.generation.storyStick.repository.UsuarioRepositorio;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepositorio userRepository;

public Optional<Usuario> cadastrarUsuario(Usuario usuario) {
		
		// Check if the login (email) exists
		if(userRepository.findByLogin(usuario.getLogin()).isPresent())
			throw new ResponseStatusException(
			          	HttpStatus.BAD_REQUEST, "Usuário já existe!", null);
			
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);

		return Optional.of(userRepository.save(usuario));
	}

	public Optional<Usuario> atualizarUsuario(Usuario usuario){
	
		if(userRepository.findById(usuario.getId()).isPresent()) {
			
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			
			String senhaEncoder = encoder.encode(usuario.getSenha());
			usuario.setSenha(senhaEncoder);
			
			return Optional.of(userRepository.save(usuario));
		
		}else {
			
			throw new ResponseStatusException(
					HttpStatus.NOT_FOUND, "Usuário não encontrado!", null);
		}
	}
	
	public Optional<LoginUsuario> Logar(Optional<LoginUsuario> usuarioLogin) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Usuario> usuario = userRepository.findByLogin(usuarioLogin.get().getLogin());

		if (usuario.isPresent()) {
			
			if (encoder.matches(usuarioLogin.get().getSenha(), usuario.get().getSenha())) {

				String auth = usuarioLogin.get().getLogin() + ":" + usuarioLogin.get().getSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);

				usuarioLogin.get().setToken(authHeader);				
				usuarioLogin.get().setNome(usuario.get().getNome());
				usuarioLogin.get().setSenha(usuario.get().getSenha());

				return usuarioLogin;
			}
		}
		throw new ResponseStatusException(
				HttpStatus.UNAUTHORIZED, "Usuário ou senha inválidos!", null);
		
	}
}
