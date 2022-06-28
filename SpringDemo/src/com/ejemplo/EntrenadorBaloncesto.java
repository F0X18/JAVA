package com.ejemplo;

import org.springframework.stereotype.Component;

@Component("mientrenadorBaloncesto")
public class EntrenadorBaloncesto implements Entrenador {

	private ExperienciaServicio experienciaServicio;
	
	// constructor con el servicio inyectado
	public EntrenadorBaloncesto(ExperienciaServicio experienciaServicio) {
	System.out.println("Inyección en el constructor");
	this.experienciaServicio = experienciaServicio;
	}
	
	@Override
	public String getEntrenamiento() {
		return "Lanzar 30 tiros a canasta";
	}

	@Override
	public int getExperiencia() {
		
		return experienciaServicio.getExperiencia();
	}
	

}