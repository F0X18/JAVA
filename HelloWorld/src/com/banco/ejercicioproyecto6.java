package com.banco;
import java.util.Scanner;

public class ejercicioproyecto6 {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		System.out.println("---\n"
							+ "1. Gestores\r\n"
							+ "2. Clientes\r\n"
							+ "3. Transferencias\r\n"
							+ "4. Mensajes\r\n"
							+ "5. Prestamos\r\n"
							+ "6. Salir\r\n");
		while (numero !=6) {
			System.out.println("Introduzca un numero: ");
			numero =keyboard.nextInt();
			if (numero == 1) {
				//Invocaci�n del m�todo que imprime "1--> Gestores"
				ejercicioproyecto4.mensajeGestores1();
				
				System.out.println("---\n"
									+ "1. Añadir gestor\r\n"
									+ "2. Modificar gestor\r\n"
									+ "3. Eliminar gestor\r\n"
									+ "4. ver gestor\r\n"
									+ "5. ver gestores\r\n"
									+ "6. atras\r\n");
									
				
			} else if (numero == 2) {
				//Invocaci�n del m�todo que imprime "2--> Clientes"
				ejercicioproyecto4.mensajeClientes2();
			} else if (numero == 3) {
				//Invocaci�n del m�todo que imprime "3--> Transferencias"
				ejercicioproyecto4.mensajeTransferencias3();
			} else if (numero == 4) {
				//Invocaci�n del m�todo que imprime "4--> Mensajes"
				ejercicioproyecto4.mensajeMensajes4();
			} else if (numero == 5) {
				//Invocaci�n del m�todo que imprime "5--> Prestamos"
				ejercicioproyecto4.mensajePrestamos5();
			} 
		}
		System.out.println("6--> Salir");
		keyboard.close();

	}
	public static void mensajePrestamos5() {
		System.out.println("5--> Prestamos");
	}
	public static void mensajeMensajes4() {
		System.out.println("4--> Mensajes");
	}
	public static void mensajeTransferencias3() {
		System.out.println("3--> Transferencias");
	}
	public static void mensajeClientes2() {
		System.out.println("2--> Clientes");
	}
	public static void mensajeGestores1() {
		System.out.println("1--> Gestores");
	}

}