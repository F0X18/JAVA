
public class Profesor extends Persona {
	//atributos
	private int numeroDeEdadesEstudiantes;
	private int sumaDeEdadesEstudiantes;
	private float estudiantesEdadMedia;
	//constructor
	
	
	public Profesor() {}
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

