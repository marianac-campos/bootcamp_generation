package br.org.generation.blogpessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity	//Creating an entity
@Table(name="tema")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message="O atributo descrição é obrigatório!")
	private String descricao;
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL) //CascadeType.ALL will change all other objects with type "theme"
	@JsonIgnoreProperties("tema") //We will use the @JsonIgnoreProperties annotation so that there is no recursion when getting the resources 
	private List<Postagem> postagem;
	
	@Transient //note that it will not be used in the database
	private int qtdTema;
	
	//get id
	public long getId() {
		return id;
	}

	//get and set description
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//get and set post
	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
	//get and set theme
	public int getQtdTema() {
		return qtdTema;
	}

	public void setQtdTema(int qtdTema) {
		this.qtdTema = qtdTema;
	}
}
