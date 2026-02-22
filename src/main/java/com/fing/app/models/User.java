package com.fing.app.models;

public class User {
	private String nombre;
	private String apellido;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String usuario) {
		this.nombre = usuario;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public User(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
}
