package com.msw.thebar.model;

import java.io.Serializable;

public class Stock implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Producto producto;
	private Double stockHeladeras;
	private Double stockDeposito;
	private Integer stockMinimo;
	private Integer stockMaximoHeladera;
	private Integer stockMaximoDeposito;
	
	public Stock(Integer id, Producto producto, Double stockHeladeras, Double stockDeposito, Integer stockMinimo,
			Integer stockMaximoHeladera, Integer stockMaximoDeposito) {
		super();
		this.id = id;
		this.producto = producto;
		this.stockHeladeras = stockHeladeras;
		this.stockDeposito = stockDeposito;
		this.stockMinimo = stockMinimo;
		this.stockMaximoHeladera = stockMaximoHeladera;
		this.stockMaximoDeposito = stockMaximoDeposito;
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

	public Double getStockHeladeras() {
		return stockHeladeras;
	}

	public void setStockHeladeras(Double stockHeladeras) {
		this.stockHeladeras = stockHeladeras;
	}

	public Double getStockDeposito() {
		return stockDeposito;
	}

	public void setStockDeposito(Double stockDeposito) {
		this.stockDeposito = stockDeposito;
	}

	public Integer getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(Integer stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public Integer getStockMaximoHeladera() {
		return stockMaximoHeladera;
	}

	public void setStockMaximoHeladera(Integer stockMaximoHeladera) {
		this.stockMaximoHeladera = stockMaximoHeladera;
	}

	public Integer getStockMaximoDeposito() {
		return stockMaximoDeposito;
	}

	public void setStockMaximoDeposito(Integer stockMaximoDeposito) {
		this.stockMaximoDeposito = stockMaximoDeposito;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Integer getStockTotal() {
		return ((Double)((this.getStockDeposito() + this.getStockHeladeras())/this.getProducto().getPeso())).intValue();
	}
	
	public Integer getStockEnHeladera() {
		return ((Double)(this.getStockHeladeras()/this.getProducto().getPeso())).intValue();
	}
	
	public Integer getStockMaximoTotal() {
		return this.getStockMaximoDeposito() + this.getStockMaximoHeladera();
	}
	
	public Integer getStockEnDeposito() {
		return ((Double)(this.getStockDeposito()/this.getProducto().getPeso())).intValue();
	}
	
	public Integer getPorcentajeHeladeras() {
		return ((Double)((this.getStockEnHeladera().doubleValue()/this.getStockMaximoHeladera().doubleValue())*100D)).intValue();
	}
	
	public Integer getPorcentajeDepositos() {
		return ((Double)((this.getStockEnDeposito().doubleValue()/this.getStockMaximoDeposito().doubleValue())*100D)).intValue();
	}
	
	public Integer getPorcentajeTotal() {
		return ((Double)((this.getStockTotal().doubleValue()/this.getStockMaximoTotal().doubleValue())*100D)).intValue();
	}
	
	public String getCriticidadStockDeposito() {
		if(this.getPorcentajeDepositos() < 20)
			return "danger";
		else if(this.getPorcentajeDepositos() < 40)
			return "warning";
		else if(this.getPorcentajeDepositos() < 60)
			return "info";
		else
			return "success";
	}
	
	public String getCriticidadStockHeladera() {
		if(this.getPorcentajeHeladeras() < 20)
			return "danger";
		else if(this.getPorcentajeHeladeras() < 40)
			return "warning";
		else if(this.getPorcentajeHeladeras() < 60)
			return "info";
		else
			return "success";
	}
	
	public String getCriticidadStockTotal() {
		if(this.getPorcentajeTotal() < 20)
			return "danger";
		else if(this.getPorcentajeTotal() < 40)
			return "warning";
		else if(this.getPorcentajeTotal() < 60)
			return "info";
		else
			return "success";
	}
}