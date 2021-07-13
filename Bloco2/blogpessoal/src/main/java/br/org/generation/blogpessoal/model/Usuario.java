package br.org.generation.blogpessoal.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity	//Creating an entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message = "O atributo nome é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres!")
	private String nome;
	
	@NotEmpty(message = "O atributo login é obrigatório!")
	@Email(message = "O atributo login deve ser um email!")
	private String login;
	
	@NotEmpty(message = "O atributo senha é obrigatório")
	@Size(min = 8, message = "O atributo senha deve ter no mínimo 8 caracteres")
	private String senha;
	
	@Column(name = "dtnascimento")
	@JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dataNascimento; 
	
	@OneToMany(mappedBy = "usuario", cascade=CascadeType.REMOVE)  //CascadeType.REMOVE will remove all other objects with type "user"
	@JsonIgnoreProperties("usuario") //We will use the @JsonIgnoreProperties annotation so that there is no recursion when getting the resources
	private List<Postagem> postagem;
	
	//constructor
	public Usuario(long id, String nome, String login, String senha, LocalDate datanascimento) {
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.dataNascimento = datanascimento;
	}
	
	public Usuario() {}
	
	//get id
	public long getId() {
		return id;
	}
	
	//get and set name
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//get and set login/email
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
	
	//get and set birth date 
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	//get and set post 
	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
}
