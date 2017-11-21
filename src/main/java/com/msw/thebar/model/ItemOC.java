package com.msw.thebar.model;

public class ItemOC {

	private Integer id;
	private Producto producto;
	private Integer cantidadAPedir;
	
	public ItemOC() {
		super();
	}

	public ItemOC(Producto producto, Integer cantidadAPedir) {
		super();
		this.producto = producto;
		this.cantidadAPedir = cantidadAPedir;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidadAPedir() {
		return cantidadAPedir;
	}

	public void setCantidadAPedir(Integer cantidadAPedir) {
		this.cantidadAPedir = cantidadAPedir;
	}
}