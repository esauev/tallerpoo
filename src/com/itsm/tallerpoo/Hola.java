package com.itsm.tallerpoo;

import java.util.Scanner;

public class Hola {
	
	public static void main(String[] args) {
//		condicionales();
//		entradaDatos();
		ciclos();
	}
	
	public static void condicionales() {
		int n1 = 10;
		int n2 = 11;
		int mayor = (n1 > n2) ? n1 : n2;
		System.out.println("El numero mayor es: " + mayor);
//		if (n1 > n2) {
//			System.out.println("El numero mayor es: " + n1);
//		} else if(n2 >= 11) {
//			System.out.println("El numero mayor es 11");
//		} else {
//			System.out.println("El numero mayor es: " + n2);
//		}	
	}
	
	public static void entradaDatos() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String nombre = input.next();
		System.out.println("Hola " + nombre + " bienvenido al taller");
	}
	
	public static void ciclos() {
		int i = 0;
//		while (i < 10) {
//			i++;
//			System.out.println("Iteracion no: " + i);
//		}
		
//		do {
//			System.out.println("Esto se ejecuta siempre");
//			i++;
//		} while (i < 5);
//		
//		System.out.println("Fin del ciclo");
		
		String opcion;
		do {
			System.out.println("Ingrese una opcion");
			Scanner input = new Scanner(System.in);
			opcion = input.next();
		} while (!opcion.equals("OK"));
		
		System.out.println("Gracias!!");	
	}

}
