package com.itsm.tallerpoo;

public class Papa implements IApellidos{
	String nombre;
	String apellidoMaterno;
	String apellidoPaterno;
	
	public Papa() {
		nombre = "Domingo";
		apellidoMaterno = "Perez";
		apellidoPaterno = "Espinoza";
	}
	
	public String getNombrePapa() {
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
