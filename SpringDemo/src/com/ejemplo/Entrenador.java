package com.ejemplo;

public interface Entrenador {
	public abstract String getEntrenamiento();
	
	// nuevo m�todo para obtener la experiencia a partir del servicio que se inyectar�
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
