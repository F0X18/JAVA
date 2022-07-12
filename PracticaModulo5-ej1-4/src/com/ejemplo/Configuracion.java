package com.ejemplo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ejemplo") 
public class Configuracion {
	
	@Bean
	public Profesor ProfesorMecanica() {
	
		ProfesorMecanica Profesor = new ProfesorMecanica();
	return Profesor;
	}
	
	@Bean
	public ExperienciaServicio experienciaServicio() {
	ExperienciaServicio experienciaServicio = new PocaExperienciaServicio();
	return experienciaServicio;
	}
	
	public int getExperienciaEntrenador() {
	return 2;
	}
}