package com.clase.info;

public class Profesor extends Persona {
	//atributos
	private int numeroDeEdadesEstudiantes;
	private int sumaDeEdadesEstudiantes;
	private float estudiantesEdadMedia;
	//constructor
	public Profesor() {
		super(13, 25, 699999999);
		/*
		 * Equivalente sin super():
		this.id=1;
		this.edat=18;
		this.telefono=699999999;
		*/
		this.numeroDeEdadesEstudiantes=3;
		this.sumaDeEdadesEstudiantes=10;
		this.estudiantesEdadMedia=18.0f;
	}
	//metodos		
	public void agregarEdadEstudiante() {}
	public void mostrarInfo(){
		getnumeroDeEdadesEstudiantes();
		getsumaDeEdadesEstudiantes();
		getestudiantesEdadMedia();
	}
	public int getnumeroDeEdadesEstudiantes() {
		return numeroDeEdadesEstudiantes;
	};
	public int getsumaDeEdadesEstudiantes() {
		return sumaDeEdadesEstudiantes;
	};
	public float getestudiantesEdadMedia() {
		return estudiantesEdadMedia;
	}
	@Override
	public void mostrarID() {
		// TODO Auto-generated method stub
		System.out.println("La id del Profesor es: "+ this.id + " - Sus estudiantes de edad media son: " + this.estudiantesEdadMedia );
	};
}

