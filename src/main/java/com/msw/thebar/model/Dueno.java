package com.msw.thebar.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cglib.core.Local;

public class Dueno extends User{

	private List<Local> locales;
	
	public Dueno() {
		super();
	}
	
	public Dueno(Integer id, String nombre, String apellido, String email, String password, List<Local> locales) {
		super(id, nombre, apellido, email, password);
		this.locales = locales;
	}

	public List<Local> getLocales() {
		if(locales == null)
			locales = new ArrayList<Local>();
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