package br.org.generation.saudeplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.saudeplus.model.Departamento;

@Repository
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Long>{
	public List<Departamento> findAllByCategoriaContainingIgnoreCase(String categoria);
}
