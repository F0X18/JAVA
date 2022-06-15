package com.string.info;

public class MainString {

	public static void main(String[] args) {
		//mostrar caracteres
		char f= 'f';
		char u= 'u';
		char l= 'l';
		char s= 's';
		char t= 't';
		char a= 'a';
		char c= 'c';
		char k= 'k';
		
		System.out.println(f);
		System.out.println(u);
		System.out.println(l);
		System.out.println(l);
		System.out.println(s);
		System.out.println(t);
		System.out.println(a);
		System.out.println(c);
		System.out.println(k);
		
		
		//cadena de texto
		String texto = "Esto es un texto";
		// 3
		System.out.println(texto.indexOf('o'));
		// -1
		System.out.println(texto.indexOf('n'));
		// 5
		System.out.println(texto.indexOf("es"));
		// -1
		System.out.println(texto.indexOf("a"));
		// 15
		System.out.println(texto.indexOf('o', 6));
		// -1
		System.out.println(texto.indexOf("ex", 6));
		// 15
		System.out.println(texto.lastIndexOf('o'));
		// -1
		System.out.println(texto.lastIndexOf('z'));
		// 5
		System.out.println(texto.lastIndexOf("es"));
		// -1
		System.out.println(texto.lastIndexOf("a"));
		// true
		System.out.println(texto.startsWith("esto"));
		// false
		System.out.println(texto.startsWith("a"));
		// convierte de booleano a String
		String str1 = String.valueOf(true);
		System.out.println(str1);
		// convierte de int a String
		String str2 = String.valueOf(1);
		System.out.println(str2);
		// convierte de char a String
		String str3 = String.valueOf('a');
		System.out.println(str3);
	}

}
