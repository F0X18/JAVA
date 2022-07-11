package com.ejemplo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		
		
		// abre el contexto a partir del archivo de configuración
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Recoge datos xml de los beans");
		
		Profesor Profesor = context.getBean("miprofesorinformatica",Profesor.class);
		System.out.println(Profesor.getTarea());
		System.out.println(Profesor.getExperiencia());
		
		Profesor Profesor1 = context.getBean("miProfesorMates",Profesor.class);
		System.out.println(Profesor1.getTarea());
		System.out.println(Profesor1.getExperiencia());
		
		Profesor Profesor2 = context.getBean("miProfesorOrientacion",Profesor.class);
		System.out.println(Profesor2.getTarea());
		System.out.println(Profesor2.getExperiencia());
		
		// cierra el contexto
		context.close();
	}

}