package com.ejemplo;

import org.springframework.stereotype.Component;

@Component
public abstract class ProfesorInformatica implements Profesor {
	//Contructor por defecto
		public ProfesorInformatica() {
			System.out.println("Contructor por defecto");
		}
		// constructor con el servicio inyectado
		public ProfesorInformatica(ExperienciaServicio experienciaServicio) {
			System.out.println("Inyección en el constructor Beans");
			this.experienciaServicio = experienciaServicio;
		}

	@Override
	public String getTarea() {
	return "Praticas con word";
}
	@PostConstruct
	public void init() {
		
		System.out.println("Inicialización Informatica");
		
	}
	@PreDestroy
	public void destroy() {

		System.out.println("Destrucción Informatica");
		
	}
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	private ExperienciaServicio experienciaServicio;
}
