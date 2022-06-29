package com.ejemplo;

import org.springframework.stereotype.Component;

@Component("mientrenadorFutbol")
public class EntrenadorFutbol implements Entrenador {
	
	protected String email;
	
	protected String equipo; 
	
	public String getEmail() {
		return email;
		}
	
	public void setEmail(String email) {
		System.out.println("Inyecci�n de un literal en un m�todo setter: " + email);
		this.email = email;
		}
		public String getEquipo() {
		return equipo;
		}
		public void setEquipo(String equipo) {
		System.out.println("Inyecci�n de un literal en un m�todo setter: " + equipo);
		this.equipo = equipo;
		}
	

	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	public EntrenadorFutbol(ExperienciaServicio experienciaServicio) {
	System.out.println("Inyecci�n en el constructor");
	this.experienciaServicio = experienciaServicio;
	}
	@Override
	public String getEntrenamiento() {
	return "Correr durante 30 minutos";
	}
	// implementaci�n del m�todo del servicio inyectado
	@Override
	public int getExperiencia() {
	return experienciaServicio.getExperiencia();
	
	
	}
	
		
	}


