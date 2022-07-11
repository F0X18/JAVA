package com.ejemplo;

import org.springframework.stereotype.Component;

@Component
public abstract class ProfesorOrientacion implements Profesor {
	
	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	public ProfesorOrientacion(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyecci�n en el constructor");
		this.experienciaServicio = experienciaServicio;
	}
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	public String getTarea() {
	return "Praticas con Curriculum Vitae";

}
public void init() {
		
		System.out.println("Inicializaci�n orientacion");
		
	}
	public void destroy() {
		
		System.out.println("Finalizaci�n orientacion");
		
	}
}
