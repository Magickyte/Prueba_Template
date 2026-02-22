package com.fing.app.models;

public class Visitor {
	
	private int id = 0;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Visitor(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}
}
