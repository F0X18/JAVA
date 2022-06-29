package com.ejemplo;

import org.springframework.stereotype.Component;

@Component("mientrenadorFutbol")
public class EntrenadorFutbol implements Entrenador {
	
	protected String email;
	
	protected String equipo; 
	

	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	public EntrenadorFutbol(ExperienciaServicio experienciaServicio) {
	System.out.println("Inyección en el constructor");
	this.experienciaServicio = experienciaServicio;
	}
	@Override
	public String getEntrenamiento() {
	return "Correr durante 30 minutos";
	}
	// implementación del método del servicio inyectado
	@Override
	public int getExperiencia() {
	return experienciaServicio.getExperiencia();
	
	
	}
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getEquipo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setEquipo(String equipo) {
		// TODO Auto-generated method stub
		
	}
}

