package com.ejemplo;

import org.springframework.stereotype.Component;

@Component
public class ProfesorOrientacion implements Profesor {
	
	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	public ProfesorOrientacion(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyecci�n en el constructor");
		this.experienciaServicio = experienciaServicio;
	}
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	// inyecci�n del servicio en un m�todo setter
		public void setExperienciaServicio(ExperienciaServicio 
											experienciaServicio) {
			System.out.println("Inyecci�n en un m�todo setter");
			this.experienciaServicio = experienciaServicio;
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
