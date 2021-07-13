package br.org.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Tema;

//database communication
@Repository
public interface TemaRepositorio extends JpaRepository<Tema, Long> {
	
	//make an appointment
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
