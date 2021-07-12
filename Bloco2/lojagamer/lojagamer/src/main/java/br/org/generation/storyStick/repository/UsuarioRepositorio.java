package br.org.generation.storyStick.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.storyStick.model.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	
	public Optional<Usuario> findByLogin(String login);
	
	public Usuario findByNome(String nome);
	
}
