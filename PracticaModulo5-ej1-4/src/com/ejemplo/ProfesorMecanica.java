package com.ejemplo;

public class ProfesorMecanica implements Profesor{

	protected String email;
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public String getTarea() {
	return "Praticas con motores";
}
@Override
public int getExperiencia() {
	return experienciaServicio.getExperiencia();
}
private ExperienciaServicio experienciaServicio;
@Override
public void setEmail(String email) {
	this.email=email;
	
}
@Override
public void init() {
	System.out.println("Inicializaci�n Mecanica");
	
}
@Override
public void destroy() {
	System.out.println("Destrucci�n Mecanica");
	
}

}
