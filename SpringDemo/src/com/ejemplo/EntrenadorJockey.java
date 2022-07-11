package com.ejemplo;

//import org.springframework.stereotype.Component;

public class EntrenadorJockey implements Entrenador {
	
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
	@Override
	public String getEntrenamiento() {
		return "30 pases con el stick";
	}
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	// inyecci�n del servicio en un m�todo setter
	public void setExperienciaServicio(ExperienciaServicio experienciaServicio) {
		System.out.println("Inyecci�n en un m�todo setter");
		this.experienciaServicio = experienciaServicio;
	}
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}