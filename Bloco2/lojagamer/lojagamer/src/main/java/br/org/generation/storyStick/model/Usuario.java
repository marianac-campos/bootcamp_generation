package br.org.generation.storyStick.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	@Size(min = 2, max = 100)
	private String nome;
	
	@NotEmpty
	@Email
	private String login;
	
	@NotEmpty
	@Size(min = 8)
	private String senha;
	
	@OneToMany(mappedBy = "usuario", cascade=CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Produto> produto;
	
	public Usuario() {}

	public Usuario(long id, String nome, String login, String senha) {
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Produto> getProduto() {
		return produto;
	}
}
