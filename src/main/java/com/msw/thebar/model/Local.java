package com.msw.thebar.model;

import java.util.ArrayList;
import java.util.List;

public class Local {

	private Integer id;
	private String nombre;
	private String direccion;
	private String telefono;
	private Boolean estado;
	private List<Stock> productos;
	private String direccionImg;
	
	public Local() {
		super();
	}

	public Local(Integer id, String nombre, String direccion, String telefono, Boolean estado, String direccionImg) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.estado = estado;
		this.direccionImg = direccionImg;
	}

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getDireccionImg() {
		return direccionImg;
	}

	public void setDireccionImg(String direccionImg) {
		this.direccionImg = direccionImg;
	}

	public List<Stock> getProductos() {
		if(productos == null)
			productos = new ArrayList<Stock>();
		return productos;
	}

	public void setProductos(List<Stock> productos) {
		this.productos = productos;
	}
}