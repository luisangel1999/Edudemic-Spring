package com.edudemic.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "libros")
public class Libro {
	@Id
	@Column(name = "libro_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "titulo", nullable = false)
	private String titulo;

	@Column(name = "autor", nullable = false)
	private String autor;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "libro_categoria", joinColumns = { @JoinColumn(name = "libro_id", nullable = false) }, inverseJoinColumns = {
			@JoinColumn(name = "categoria_id", nullable = false) })
	
	
	
	private List<Categoria> categorias = new ArrayList<>();

	@Column(name = "Anio",nullable = false)
	@DateTimeFormat(pattern = "yyyy")
	private Date fechaPublicacion;

	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "enlace", nullable = false)
	private String enlace;

	public Libro() {}
	public Libro(Long id, String titulo, String autor, Date fechaPublicacion, String enlace, String descripcion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
		this.enlace = enlace;
		this.descripcion = descripcion;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public List<Categoria> getCategories() {
		return categorias;
	}

	public void setCategories(List<Categoria> categories) {
		this.categorias = categories;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	

}
