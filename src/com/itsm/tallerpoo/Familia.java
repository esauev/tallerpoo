package com.itsm.tallerpoo;

public class Familia {
	public static void main(String[] args) {
		//papa y mama
		Papa papa = new Papa();
		Mama mama = new Mama();
		System.out.println("Familia");
		System.out.println(papa.getNombrePapa() + " y " + mama.getNombreMama());
		//hijo
		System.out.println("Hij(@)s");
		Hijo hijo = new Hijo();
		System.out.println(hijo.getNombre() + " " 
		+ hijo.apellidoPaterno() + " " 
				+ hijo.apellidoMaterno());
	}
}
