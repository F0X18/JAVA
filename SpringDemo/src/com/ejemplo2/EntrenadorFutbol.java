package com.ejemplo2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntrenadorFutbol implements Entrenador{

	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	@Autowired
	public EntrenadorFutbol(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyecci�n en el constructor");
		this.experienciaServicio = experienciaServicio;
	}
	public int getExperiencia() {
		return this.experienciaServicio.getExperiencia();
	}

}