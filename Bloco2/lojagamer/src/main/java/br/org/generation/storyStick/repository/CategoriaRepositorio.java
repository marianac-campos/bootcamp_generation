package br.org.generation.storyStick.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.storyStick.model.Categoria;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
}
