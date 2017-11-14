package com.msw.thebar.model;

import java.io.Serializable;

public class Promocion implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nombre;
	private String urlImagen;
	
	/*Constructor*/
	public Promocion(Integer id, String nombre, String urlImagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.urlImagen = urlImagen;
	}
	
	/*Getters y Setters*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
}