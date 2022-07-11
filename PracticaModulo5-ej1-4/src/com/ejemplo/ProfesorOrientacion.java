package com.ejemplo;

import org.springframework.stereotype.Component;

@Component
public class ProfesorOrientacion implements Profesor {
	
	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	public ProfesorOrientacion(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyección en el constructor");
		this.experienciaServicio = experienciaServicio;
	}
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	// inyección del servicio en un método setter
		public void setExperienciaServicio(ExperienciaServicio 
											experienciaServicio) {
			System.out.println("Inyección en un método setter");
			this.experienciaServicio = experienciaServicio;
		}
	public String getTarea() {
	return "Praticas con Curriculum Vitae";

}
public void init() {
		
		System.out.println("Inicialización orientacion");
		
	}
	public void destroy() {
		
		System.out.println("Finalización orientacion");
		
	}
}
