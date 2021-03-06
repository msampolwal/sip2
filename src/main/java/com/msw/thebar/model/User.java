package com.msw.thebar.model;

public class User {

	private Integer id;
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	private Integer puntosAcumulados;
	private Rol rol;
	
	public User() {
		super();
	}
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public User(Integer id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	public User(Integer id, String nombre, String apellido, String email, String password, Integer puntosAcumulados, Rol rol) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.puntosAcumulados = puntosAcumulados;
		this.rol = rol;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getPuntosAcumulados() {
		return puntosAcumulados;
	}
	public void setPuntosAcumulados(Integer puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public String getTipo() {
		return this.getRol().getDescripcion();
	}
}