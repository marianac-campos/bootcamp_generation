package br.org.generation.storyStick.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max=55, message="Campo 'nome' é obrigatório!")
	private String nome;
	
	@Size(max=55)
	private String fabricante;
	
	@NotNull
	private BigDecimal preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	//get and set id
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	//get and set name
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//get and set maker
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	//get and set price

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

	//get and set category
	public Categoria getCategoria() {
		return categoria;
	}

	public BigDecimal getPreco() {
		return preco;
	}
}
