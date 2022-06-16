package com.string.info;

public class ejerciciopag421 {

	public static void main(String[] args) {
		/*Ejercicio: escribe un programa que concatene dos StringBuilder, utilizando append y
		tambi�n el operador concatenaci�n.*/
		StringBuilder strb1 = new StringBuilder("hola a todos");
		StringBuilder strb2 = new StringBuilder(", hoy se cena");
		strb1.append(strb2);
		System.out.println(strb1);
		StringBuilder strb3 = new StringBuilder("hola a todos");
		StringBuilder strb4 = new StringBuilder(", hoy se cena");
		String str1 = strb3.toString();
		String str2 = strb4.toString();
		System.out.println(str1 + str2);
		
		/*Ejercicio: escribe un programa que elimine el �ltimo car�cter de un StringBuilder*/
		StringBuilder strb6 = new StringBuilder("hola a todos");
		strb6.deleteCharAt(11);
		System.out.println(strb6);
		
		
		/*Ejercicio: escribe un programa que inserte el car�cter 'b' cada tres posiciones en un
		StringBuilder.*/	
		StringBuilder strb7 = new StringBuilder("hola");
		strb7.insert(2, "b");
		System.out.println(strb7);

		
		
		/*Ejercicio: escribe un programa que convierta en may�sculas la primera letra de cada
		palabra de un StringBuilder.*/
		StringBuilder strb8 = new StringBuilder("hola");
		strb8.setCharAt(0, 'H');
		System.out.println(strb8);

		
		
		/*Ejercicio: escribe un programa para invertir cada palabra de un p�rrafo de un
		StringBuilder.*/
		StringBuilder strb9 = new StringBuilder("Lorem Ipsum is simply dummy text.");
		strb9.reverse();
		System.out.println(strb9);
		
	}

}
