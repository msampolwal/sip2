package com.msw.thebar.model;

import java.io.Serializable;

public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String descripcion;
	private Double peso;
	private Double precio;
	private String imagen;
	private String proveedor;
	private String emailProveedor;
	
	public Producto(Integer id, String descripcion, Double peso, Double precio, String imagen, String proveedor, String emailProveedor) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.peso = peso;
		this.precio = precio;
		this.imagen = imagen;
		this.proveedor = proveedor;
		this.emailProveedor = emailProveedor;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getEmailProveedor() {
		return emailProveedor;
	}

	public void setEmailProveedor(String emailProveedor) {
		this.emailProveedor = emailProveedor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}