package br.org.generation.storyStick.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max=55, message="Campo 'tipo' é obrigatório!")
	private String tipo;
	
	@OneToMany(mappedBy = "categoria", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
	
	//get and set id
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	//get and set type
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
}
