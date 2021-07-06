package br.org.generation.blogpessoal.model;

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
@Table(name="tema")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min=3, max=25, message="O campo 'descrição' é obrigatório!")
	private String descricao;
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL) //CascadeType.ALL will change all other objects with type "theme"
	@JsonIgnoreProperties("tema") //We will use the @JsonIgnoreProperties annotation so that there is no recursion when getting the resources 
	private List<Postagem> postagem;
	
	//GETTERS AND SETTERS
	
	//id
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	//description
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//post
	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
}
