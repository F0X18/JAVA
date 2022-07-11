package com.ejemplo;

import org.springframework.stereotype.Component;

@Component
public class ProfesorInformatica implements Profesor {
	
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
	//Contructor por defecto
		public ProfesorInformatica() {
			System.out.println("Contructor por defecto");
		}
		// constructor con el servicio inyectado
		public ProfesorInformatica(ExperienciaServicio experienciaServicio) {
			System.out.println("Inyecci�n en el constructor Beans");
			this.experienciaServicio = experienciaServicio;
		}

	@Override
	public String getTarea() {
	return "Praticas con word";
}
	@PostConstruct
	public void init() {
		
		System.out.println("Inicializaci�n Informatica");
		
	}
	@PreDestroy
	public void destroy() {

		System.out.println("Destrucci�n Informatica");
		
	}
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	private ExperienciaServicio experienciaServicio;
	
}
