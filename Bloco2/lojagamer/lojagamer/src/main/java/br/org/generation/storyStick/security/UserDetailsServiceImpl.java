package br.org.generation.storyStick.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.org.generation.storyStick.model.Usuario;
import br.org.generation.storyStick.repository.UsuarioRepositorio;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UsuarioRepositorio userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Usuario> usuario = userRepository.findByLogin(username);
		usuario.orElseThrow(() -> new UsernameNotFoundException(username + "not found."));
		
		return usuario.map(UserDetailsImpl::new).get();
		
	}
}
