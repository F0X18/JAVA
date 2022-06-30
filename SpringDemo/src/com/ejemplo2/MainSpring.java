package com.ejemplo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class MainSpring {

	public static void main(String[] args) {
		
		// se carga la configuración del container de Spring
		AnnotationConfigApplicationContext context = new
		AnnotationConfigApplicationContext(Configuracion.class);
		
		ExperienciaServicio experienciaServicio;
		
		//Entrenador entrenador= new EntrenadorFutbol("mientrenadorFutbol");
		//System.out.println(entrenador.getExperiencia());
		
		Entrenador entrenador = context.getBean("entrenadorFutbol", Entrenador.class);
		System.out.println(entrenador);
		
		Entrenador entrenador= new EntrenadorFutbol("mientrenadorFutbol");
		System.out.println(entrenador.getExperiencia());
		
		context.close();
	}

}
