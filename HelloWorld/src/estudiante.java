
public class estudiante {

}
	public class Estudiante()
		
	
	public Estudiante() {
		this.id=1;
		this.edad=18;
		this.telefono=999999999;
		this.numeroDeNotas=10;
		this.notaMedia=10;
	}
	public Estudiante(int id){
		this.id=id;
		this.edad=20;
		this.telefono=666666666;
		this.numeroDeNotas=8;
		this.notaMedia=6.5f;
	}
	public Estudiante(float notaMedia, int numeroDeNotas) {
		this.id=2;
		this.edad=21;
		this.telefono=333333333;
		this.numeroDeNotas=numeroDeNotas;
		this.notaMedia=notaMedia;
		
	}
	//atributos
	private int id;
	private byte edad;
	private int telefono;
	private int numeroDeNotas;
	private float notaMedia;
	
	//metodo
	public void mostrarInfo() {};
	public void agregarNuevaNota() {};
	
	

}

