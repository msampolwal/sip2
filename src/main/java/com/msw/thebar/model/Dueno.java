package com.msw.thebar.model;

import java.util.List;

import org.springframework.cglib.core.Local;

public class Dueno extends User{

	private List<Local> locales;
	
	public Dueno() {
		super();
	}
	
	public List<Local> getLocales() {
		return locales;
	}

	public void setLocales(List<Local> locales) {
		this.locales = locales;
	}
	
	@Override
	public String getTipo() {
		return "Dueno";
	}
}