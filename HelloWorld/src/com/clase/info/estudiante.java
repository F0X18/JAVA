package com.clase.info;

public class estudiante extends Persona {
	//Constructor por defecto
	public estudiante() {
		this.id=1;
		this.telefono=699999999;
		this.numeroDeNotas=1;
		this.sumaDeNotas=10;
		this.notaMedia=5;
	}
	//Constructor con un par�metro
	public estudiante(int id) {
		this.id=id;
		this.telefono=699999996;
		this.numeroDeNotas=3;
		this.sumaDeNotas=7;
		this.notaMedia=7.5;
	}
	//Constructor con dos par�metros
	public estudiante(int id, int edat) {
		this.id=id;
		this.telefono=699999996;
		this.numeroDeNotas=3;
		this.sumaDeNotas=7;
		this.notaMedia=7.5;
	}
	//Constructor con todos los par�metros
	public estudiante(int id,int edat,int telefono,int numeroDeNotas,int sumaDeNotas,double notaMedia) {
		this.numeroDeNotas=numeroDeNotas;
		this.sumaDeNotas=sumaDeNotas;
		this.notaMedia=notaMedia;
	}
	//Atributos privados es lo normal
	private int numeroDeNotas;
	private int sumaDeNotas;
	private double notaMedia;
	//public static float crearEstudiante = Estudiante();
	//M�todos p�blicos		
	public void mostrarInfo() {
		getNumeroDeNotas();
		getSumaDeNotas();
		getNotaMedia();	
	};

	public int getNumeroDeNotas() {
		return numeroDeNotas;
	};
	public void setNumeroDeNotas(int numeroDeNotas) {
		this.numeroDeNotas = numeroDeNotas;
	};
	public int getSumaDeNotas() {
		return sumaDeNotas;
	};
	public void setSumaDeNotas(int sumaDeNotas) {
		this.sumaDeNotas = sumaDeNotas;
	};
	public double getNotaMedia() {
		return notaMedia;
	};
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	};
	public void agregarNuevaNota() {
		numeroDeNotas++;
	}
	//Ejercicio p�g 380
	public void agregarNuevaNota(int nota) {
		agregarNuevaNota();
		sumaDeNotas+=nota;
		notaMedia=sumaDeNotas/numeroDeNotas;
	}
	public void agregarNuevaNota(int nota, boolean notaTrue) {
		if (notaTrue) {
			numeroDeNotas=0;
			sumaDeNotas=0;
			notaMedia=0;
		} else {
			agregarNuevaNota();
			agregarNuevaNota(nota);
		}
		
	}
	@Override
	public void mostrarID() {
		// TODO Auto-generated method stub
		System.out.println("La id del estudiante es: "+ this.id + " - Su nota media es: " + this.notaMedia );
	}
}