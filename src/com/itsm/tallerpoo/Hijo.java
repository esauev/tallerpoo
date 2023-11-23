package com.itsm.tallerpoo;

public class Hijo implements IApellidos {
	
	String nombre;
	String apellidoMaterno;
	String apellidoPaterno;
	
	public Hijo() {
		nombre = "Esau";
		Mama mama = new Mama();
		apellidoMaterno = mama.apellidoPaterno();
		Papa papa = new Papa();
		apellidoPaterno = papa.apellidoPaterno();
	}
	
	public String getNombre() {
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
