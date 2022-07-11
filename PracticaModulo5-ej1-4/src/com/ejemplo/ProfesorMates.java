package com.ejemplo;

import org.springframework.stereotype.Component;

@Component
public abstract class ProfesorMates implements Profesor {
	
	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	public ProfesorMates(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyección en el constructor");
		this.experienciaServicio = experienciaServicio;
	}
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	public String getTarea() {
	return "Praticas con logaritmos";
}
	public void init() {
		
		System.out.println("Inicialización mates");
		
	}
	public void destroy() {
		
		System.out.println("Finalización mates");
		
	}
}
