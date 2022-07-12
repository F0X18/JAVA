package com.ejemplo;

public class ProfesorMecanica implements Profesor{
	
	//Contructor por defecto
		public ProfesorMecanica() {
			System.out.println("Contructor por defecto");
		}
	
	protected String email;
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public String getTarea() {
	return "Praticas con motores";
}
	// constructor con el servicio inyectado
		public ProfesorMecanica(ExperienciaServicio experienciaServicio) {
			System.out.println("Inyección en el constructor Beans");
			this.experienciaServicio = experienciaServicio;
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
	System.out.println("Inicialización Mecanica");
	
}
@Override
public void destroy() {
	System.out.println("Destrucción Mecanica");
	
}

}
