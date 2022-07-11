package com.ejemplo;

import org.springframework.stereotype.Component;

@Component
public class ProfesorMates implements Profesor {
	
	protected String email;
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public void setEmail(String email) {
		System.out.println("Inyecci�n de un valor literal en un m�todo setter: " + email);
		this.email=email;
	}
	
	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	public ProfesorMates(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyecci�n en el constructor");
		this.experienciaServicio = experienciaServicio;
	}
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	public String getTarea() {
	return "Praticas con logaritmos";
}
	public void init() {
		
		System.out.println("Inicializaci�n mates");
		
	}
	public void destroy() {
		
		System.out.println("Finalizaci�n mates");
		
	}
	
}
