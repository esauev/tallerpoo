package com.itsm.tallerpoo;

import java.util.Scanner;

public class Hola {
	
	public static void main(String[] args) {
//		condicionales();
//		entradaDatos();
//		ciclos();
//		vectores();
		matrices();
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
//		int i = 0;
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
		
//		String opcion;
//		do {
//			System.out.println("Ingrese una opcion");
//			Scanner input = new Scanner(System.in);
//			opcion = input.next();
//		} while (!opcion.equals("OK"));
//		
//		System.out.println("Gracias!!");
		
		String[] nombres = {"Juan", "Pedro", "Jose", "Maria"};
		for(int i=0; i<nombres.length; i++) {
			System.out.println("posicion " + i + " esta " 
		       + nombres[i]);
		}
		
		for(String nombre : nombres) {
			System.out.println(nombre);
		}
	}
	
	public static void vectores() {
//		|"Dato1"|"Dato2"| Ejemplo Vector
		String[] vector = new String[2];
		vector[0] = "Dato1";
		vector[1] = "Dato2";
		for(String v : vector) {
			System.out.println("valor: " + v);
		}
//		for (int i = 0; i < vector.length; i++) {
//			System.out.println("posicion: " + i + 
//					" tiene el valor: " + vector[i]);
//			continue;
//		}		
		
//		|"maria"|"martha"|
//		------------------  Ejemplo Vector Paralelo
//		|   21  |   20   |
		String[] alumnos = new String[2];
		Integer[] edades = new Integer[2];
		alumnos[0] = "maria";
		edades[0] = 21;
		alumnos[1] = "martha";
		edades[1] = 20;
		for (int i = 0; i < 2; i++) {
			System.out.println("alumno: " + alumnos[i]
					+ " tiene: " + edades[i]
							+ " años");
		}
		
	}
	
	public static void matrices() {
		Integer[][] caja = new Integer[3][3];
		Scanner ingresar = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Ingrese en la fila: " + i +
						" y en la columna: " + j);
				caja[i][j] = ingresar.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				//opcion 1
				System.out.print(caja[i][j]);
				j++;
				System.out.print(caja[i][j]);
				j++;
				System.out.println(caja[i][j]);
				//opcion2
				if(j==2)
					System.out.print(caja[i][j] + "\n");
				else
					System.out.print(caja[i][j]);	
			}
		}
	}

}
