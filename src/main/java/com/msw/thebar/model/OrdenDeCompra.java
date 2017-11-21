package com.msw.thebar.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenDeCompra {

	private Integer id;
	private Date fecha;
	private List<ItemOC> item;
	
	public OrdenDeCompra() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<ItemOC> getItem() {
		if(item == null)
			item = new ArrayList<ItemOC>();
		return item;
	}

	public void setItem(List<ItemOC> item) {
		this.item = item;
	}
}