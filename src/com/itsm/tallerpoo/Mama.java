package com.itsm.tallerpoo;

public class Mama implements IApellidos{
	String nombre;
	String apellidoMaterno;
	String apellidoPaterno;
	
	public Mama() {
		nombre = "Maria";
		apellidoPaterno = "Villarreal";
		apellidoMaterno = "De la Cruz";
	}
	
	public String getNombreMama() {
		return nombre;
	}

	@Override
	public String apellidoPaterno() {
		return apellidoPaterno;
	}

	@Override
	public String apellidoMaterno() {
		return apellidoMaterno;
	}
}
