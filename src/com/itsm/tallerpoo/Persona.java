package com.itsm.tallerpoo;

public class Persona {
	
	String nombreCompleto;
	Integer edad;
	Double estatura;
	String genero;

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.nombreCompleto = obtenerNombre();
		persona.edad = obtenerEdad();
		persona.estatura = obtenerEstatura();
		persona.genero = obtenerGenero();
		System.out.print(persona.nombreCompleto + "\n" +
		persona.edad + "\n" +
		persona.estatura + "\n" +
		persona.genero+ "\n" );
	}
	
	public static String obtenerNombre() {
		return "Esau Espinoza Villarreal";
	}
	
	public static Integer obtenerEdad() {
		return 36;
	}
	
	public static Double obtenerEstatura() {
		return 1.69;
	}
	
	public static String obtenerGenero() {
		return "Masculino";
	}

}
