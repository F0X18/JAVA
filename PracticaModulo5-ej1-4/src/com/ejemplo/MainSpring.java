package com.ejemplo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		
		
		// abre el contexto a partir del archivo de configuraci�n
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Recoge datos xml de los beans");
		
		Profesor Profesor = context.getBean("miprofesorinformatica",Profesor.class);
		System.out.println(Profesor.getTarea());
		System.out.println(Profesor.getExperiencia());
		
		// cierra el contexto
		context.close();
	}

}