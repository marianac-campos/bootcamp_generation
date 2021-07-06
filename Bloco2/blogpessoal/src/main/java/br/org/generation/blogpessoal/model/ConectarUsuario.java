package br.org.generation.blogpessoal.model;

public class ConectarUsuario {
	
	private String nome;
	private String usuario;
	private String senha;
	private String token;

	
	//get and set name 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//get and set user 
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	//get and set password 
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//get and set token
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
