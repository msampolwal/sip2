package com.msw.thebar.model;

public class Cliente extends User{

	private Integer puntosAcumulados;

	public Cliente() {
		super();
	}

	public Integer getPuntosAcumulados() {
		return puntosAcumulados;
	}

	public void setPuntosAcumulados(Integer puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}
	
	@Override
	public String getTipo() {
		return "Cliente";
	}
}
