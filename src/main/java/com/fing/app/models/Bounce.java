package com.fing.app.models;

public class Bounce {
	private double porcentaje = 0.0;

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public Bounce(double porcentaje) {
		this.porcentaje = porcentaje;
	}
}
