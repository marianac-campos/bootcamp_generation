package br.org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Creating an entity
@Table(name = "postagem")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message = "O atributo título é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres!")
	private String titulo;
	
	@NotEmpty(message="O atributo texto é obrigatório!")
	@Size(min=15, max=500, message = "O atributo texto deve conter no mínimo 15 e no máximo 500 caracteres!")
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP) //TIMESTAMP = Go get the system's time
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@PositiveOrZero
	private int curtidas;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	
	//get id
	public long getId() {
		return id;
	}
	
	//get and set title
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//get and set text
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	//get time
	public Date getData() {
		return data;
	}
	
	//get and set likes
	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	//get and set theme
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
		
	//get and set user
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
