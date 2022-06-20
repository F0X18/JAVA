package com.string.info;

public class ejerciciopag421 {

	public static void main(String[] args) {
		/*Ejercicio 1: escribe un programa que concatene dos StringBuilder, utilizando append y
		también el operador concatenación.*/
		StringBuilder strb1 = new StringBuilder("hola a todos");
		StringBuilder strb2 = new StringBuilder(", hoy se cena");
		strb1.append(strb2);
		System.out.println(strb1);
		StringBuilder strb3 = new StringBuilder("hola a todos");
		StringBuilder strb4 = new StringBuilder(", hoy se cena");
		String str1 = strb3.toString();
		String str2 = strb4.toString();
		System.out.println(str1 + str2);
		
		/*Ejercicio 2: escribe un programa que elimine el último carácter de un StringBuilder*/
		StringBuilder strb6 = new StringBuilder("hola a todos");
		strb6.deleteCharAt(11);
		System.out.println(strb6);
		
		
		/*Ejercicio: escribe un programa que inserte el carácter 'b' cada tres posiciones en un
		StringBuilder.*/	
		StringBuilder strb7 = new StringBuilder("hola");
		strb7.insert(2, "b");
		System.out.println(strb7);
		
		for(int i=0;i<strb1.length()-1;i+=3) {
			strb1.insert(i,"b");
		}
		System.out.println(strb1);
		
		
		/*Ejercicio: escribe un programa que convierta en mayúsculas la primera letra de cada
		palabra de un StringBuilder.*/
		StringBuilder strb8 = new StringBuilder("Hola buenas, hoy se come");
		String conv=strb8.toString();
		int pos=0;
		String espacio=" ";
		String letra="";
		
		
		
		for(int i=0;i<conv.length();i++) {
			letra=letra.valueOf(conv.charAt(i));
			letra=letra.toUpperCase();
			
			if (letra.equals(espacio)) {
				pos=i;
				conv.charAt(i);
				letra=letra.valueOf(conv.charAt(pos+1));
	    		letra=letra.toUpperCase();
				strb8.replace(i+1,+2,letra);		
				} 
				
				
	
		}
		System.out.println(strb8);

		
		
		/*Ejercicio: escribe un programa para invertir cada palabra de un párrafo de un
		StringBuilder.*/
		StringBuilder strb9 = new StringBuilder("Lorem Ipsum is simply dummy text.");
		strb9.reverse();
		System.out.println(strb9);
		
	}

}

