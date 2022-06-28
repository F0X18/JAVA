package Com.Ejemplo;

import org.springframework.stereotype.Component;

@Component("mientrenadorFutbol")
public class EntrenadorFutbol implements Entrenador {

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
