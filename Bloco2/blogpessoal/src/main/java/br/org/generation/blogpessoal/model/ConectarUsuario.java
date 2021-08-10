package br.org.generation.blogpessoal.model;

public class ConectarUsuario {
	
	private long id;
	private String nome;
	private String login;
	private String senha;
	private String token;
	private String foto;
	private String tipo;
	
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
	
	//get and set user 
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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
	
	//get and set photo
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	//get and set type
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
