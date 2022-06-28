package Com.Ejemplo;

import org.springframework.stereotype.Component;

@Component("mientrenadorFutbol")
public class EntrenadorFutbol implements Entrenador {

	private ExperienciaServicio experienciaServicio;
	// constructor con el servicio inyectado
	public EntrenadorFutbol(ExperienciaServicio experienciaServicio) {
	System.out.println("Inyección en el constructor");
	this.experienciaServicio = experienciaServicio;
	}
	@Override
	public String getEntrenamiento() {
	return "Correr durante 30 minutos";
	}
	// implementación del método del servicio inyectado
	@Override
	public int getExperiencia() {
	return experienciaServicio.getExperiencia();
	
	
	}
}

