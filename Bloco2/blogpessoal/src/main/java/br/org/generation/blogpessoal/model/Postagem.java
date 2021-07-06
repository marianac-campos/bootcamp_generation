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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//Creating an entity

@Entity
@Table(name = "postagem")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min=5, max=100, message="Este campo é obrigatório!")
	private String titulo;
	
	@NotNull
	@Size(min=15, max=500, message="Este campo é obrigatório!")
	private String texto;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	
	@Temporal(TemporalType.TIMESTAMP) //TIMESTAMP = Go get the system's time
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	//get and set id
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
	//get and set time
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	//get and set theme
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
}
