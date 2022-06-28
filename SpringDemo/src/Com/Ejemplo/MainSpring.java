package Com.Ejemplo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		/*Entrenador entrenadorFutbol = new EntrenadorFutbol();
		Entrenador entrenadorBaloncesto= new EntrenadorBaloncesto();
		System.out.println(entrenadorFutbol.getEntrenamiento());
		System.out.println(entrenadorBaloncesto.getEntrenamiento());*/
		
		// abre el contexto a partir del archivo de configuraci�n
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Recoge datos xml de los beans");
		/*
		obtiene el bean, donde:
		- el primer par�metro es el identificador del bean
		- el segundo par�metro es la interfaz que implementa el bean a recibir, realizando
		una especie casting
		*/
		//Entrenador entrenador = context.getBean("mientrenadorBaloncesto", Entrenador.class);
		//System.out.println(entrenador.getEntrenamiento());
		
		//Entrenador entrenador1 = context.getBean("mientrenadorFutbol", Entrenador.class);
		//System.out.println(entrenador1.getEntrenamiento());
		
		//Entrenador entrenador2 = context.getBean("mientrenadorTenis", Entrenador.class);
		//System.out.println(entrenador2.getEntrenamiento());
		
		Entrenador entrenador3 = context.getBean("mientrenadorFutbol1", Entrenador.class);
		System.out.println(entrenador3.getExperiencia());
		System.out.println(entrenador3.getEntrenamiento());
		
		Entrenador entrenador4 = context.getBean("mientrenadorBaloncesto", Entrenador.class);
		System.out.println(entrenador4.getExperiencia());
		System.out.println(entrenador4.getEntrenamiento());
		
		Entrenador entrenador5 = context.getBean("mientrenadorTenis", Entrenador.class);
		System.out.println(entrenador5.getExperiencia());
		System.out.println(entrenador5.getEntrenamiento());
		// cierra el contexto
		context.close();
	}

}