package com.string.info;

public class ejercicopag413 {

	public static void main(String[] args) {
		
		
		String a="hola";
		String b="habla";
		int ultimoValorA=a.length()-1;
		int ultimoValorB=b.length()-1;
		String substringabc=" hola, abc anda por aqui";
		
		
		//Ejercicio: escribe un programa que dado dos String compruebe si los dos primeros caracteres son iguales.
	
		
		
		
		if(a.charAt(0)==b.charAt(0)) {
			System.out.println("son caracteres iniciales iguales");
		} else {
			System.out.println("no son caracteres iniciales iguales");
		}
		
		/*Ejercicio: escribe un programa que dado dos String compruebe si los dos primeros caracteres y 
		los dos �ltimos son iguales.*/
		if (a.charAt(0)==b.charAt(0) && a.charAt(ultimoValorA)==b.charAt(ultimoValorB)) {
			System.out.println("El primero y el �ltimo"
							+ " caracter son iguales");
		} else {
			System.out.println("El primero y el �ltimo"
					+ " caracter son diferentes");
		
		
		
		
		/*Ejercicio: escribe un programa que compruebe que el substring "abc" se encuentra en un
			String dado, pero no puede encontrarse ni al comienzo, ni al final.*/
		if((substringabc.indexOf("abc") !=-1)
			&& (substringabc.indexOf("abc") !=0)
			&& (substringabc.lastIndexOf("abc")!= substringabc.length()-3))
		{
			System.out.println("si que hay una cadena -abc- dentro del string");
		} else {
			System.out.println("no hay una cadena -abc- dentro del string o estan en los extremos");
		}
		
		
		/*Ejercicio: escribe un programa que dado un String y un determinado �ndice, compruebe
			que el car�cter anterior y el posterior son iguales o no.*/
		
		String texto3= "Lorem ipsum dolor sit amet";
		int indice = 3; 
		int segundoIndice = 15;
		if ((texto3.charAt(indice)==texto3.charAt(indice-1)) 
				&& (texto3.charAt(indice)==texto3.charAt(indice+1))) {	
			System.out.printf("El caracter que esta en el indice %d, "
					+ "es igual a su anterior y posterior", indice).println();
		} else {
			System.out.printf("El caracter que esta en el indice %d, es "
					+ "diferente a su anterior y posterior", indice).println();
		}
		if ((texto3.charAt(segundoIndice)==texto3.charAt(segundoIndice-1)) 
				&& (texto3.charAt(segundoIndice)==texto3.charAt(segundoIndice+1))) {	
			System.out.printf("El caracter que esta en el indice %d, "
					+ "es igual a su anterior y posterior", segundoIndice).println();
		} else {
			System.out.printf("El caracter que esta en el indice %d, es "
					+ "diferente a su anterior y posterior", segundoIndice).println();
		}
		
		
		/*Ejercicio: escribe un programa que muestra por pantalla el �ndice de la segunda y tercera
			ocurrencia del car�cter 'a' en un String dado.*/
		
		
		/*Ejercicio: escribe un programa que devuelva si un String es pal�ndromo (se escribe igual
			hacia delante y hacia detr�s). Ejemplo: "sometemos".*/
		/*String pali= "arroz";
		String pali2="";
		String caracter;
		int i=pali.length()-1;
		for (int i, i>=0,i--);{
			caracter=pali.charAt(i);
			pali2= pali2.concat(charAt(i));
		}
		
		if(pali==pali2) {
			System.out.println("Es un palindromo");
		}else {
			System.out.println("No es un palindromo");
		}
		
		
		
	}

}
