package br.org.generation.storyStick.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.storyStick.model.Produto;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
