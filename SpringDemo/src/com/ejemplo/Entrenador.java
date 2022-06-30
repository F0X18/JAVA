package com.ejemplo;

public interface Entrenador {
	public abstract String getEntrenamiento();
	
	// nuevo método para obtener la experiencia a partir del servicio que se inyectará
	public abstract int getExperiencia();
	//metodo email
	public String getEmail();
	public void setEmail(String email);
	//metodo equipo
	public String getEquipo();
	public void setEquipo(String equipo);
	
	//metodo init y destroy
	public void init();
	public void destroy();
}
