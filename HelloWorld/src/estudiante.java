
public class estudiante {
	//Constructor por defecto
	public estudiante() {
		this.id=1;
		this.edat=18;
		this.telefono=699999999;
		this.numeroDeNotas=1;
		this.sumaDeNotas=10;
		this.notaMedia=5;
	}
	//Constructor con un par�metro
	public estudiante(int id) {
		this.id=id;
		this.edat=23;
		this.telefono=699999996;
		this.numeroDeNotas=3;
		this.sumaDeNotas=7;
		this.notaMedia=7.5;
	}
	//Constructor con dos par�metros
	public estudiante(int id, int edat) {
		this.id=id;
		this.edat=edat;
		this.telefono=699999996;
		this.numeroDeNotas=3;
		this.sumaDeNotas=7;
		this.notaMedia=7.5;
	}
	//Constructor con todos los par�metros
	public estudiante(int id,int edat,int telefono,int numeroDeNotas,int sumaDeNotas,double notaMedia) {
		this.id=id;
		this.edat=edat;
		this.telefono=telefono;
		this.numeroDeNotas=numeroDeNotas;
		this.sumaDeNotas=sumaDeNotas;
		this.notaMedia=notaMedia;
	}
	//Atributos privados es lo normal
	private int id;
	private int edat;
	private int telefono;
	private int numeroDeNotas;
	private int sumaDeNotas;
	private double notaMedia;
	//M�todos p�blicos
	public void mostrarInfo() {};
	public void agragarNuevaNota() {};
	public int getId() {
		return id;
	};
	public void SetId(int id) {
		this.id = id;
	};
	public void Setedat(int edat) {
		this.edat = edat;
	};
	public void Settelefono(int telefono) {
		this.telefono = telefono;
	};
	public void SetnumeroDeNotas(int numeroDeNotas) {
		this.numeroDeNotas = numeroDeNotas;
	};
	public void SetsumaDeNotas(int sumaDeNotas) {
		this.sumaDeNotas = sumaDeNotas;
	};
	public void SetnotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}
	public int getedat() {
		// TODO Auto-generated method stub
		return this.edat = edat;
	}
	public int gettelefono() {
		// TODO Auto-generated method stub
		return this.telefono = telefono;
	}
	public int getnumeroDeNotas() {
		// TODO Auto-generated method stub
		return this.numeroDeNotas = numeroDeNotas;
	}
	public double getnotaMedia() {
		// TODO Auto-generated method stub
		return this.notaMedia = notaMedia;
	};
}

