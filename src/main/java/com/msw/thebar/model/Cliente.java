package com.msw.thebar.model;

public class Cliente extends User{

	private Integer puntosAcumulados;

	public Cliente() {
		super();
	}

	public Cliente(Integer id, String nombre, String apellido, String email, String password, Integer puntosAcumulados) {
		super(id, nombre, apellido, email, password);
		this.puntosAcumulados = puntosAcumulados;
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
