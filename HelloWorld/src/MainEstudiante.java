
public class MainEstudiante {

	public static void main(String[] args) {
		estudiante isaac = new estudiante();
		estudiante albert = new estudiante(3);
		estudiante laura = new estudiante(5,19);
		estudiante alison = new estudiante(5 , 25 , 696999999, 8 , 8 , 8.0);
		estudiante adrian = new estudiante(18);
		//Mostrar la id del estudiante albert solo si es visible, es decir, "public"
		//System.out.println(albert.id);
		System.out.println(isaac.getId()); //Muestra valor actual = 1
		isaac.setId(3);//Modificamos valor actual, asignando por argumento un 3
		System.out.println(isaac.getId());//Muestra valor actual = 3
		System.out.println(albert.getTelefono()); //Muestra valor 699999996
		albert.setTelefono(654321789);//Modificamos valor actual
		System.out.println(albert.getTelefono()); //Muestra valor 654321789
		System.out.println(isaac.getTelefono()); //Muestra valor 699999999
		System.out.println(laura.getId()); //Muestra valor actual
		laura.setId(5);//Modificamos valor actual, asignando por argumento
		System.out.println(alison.getId()); //Muestra valor actual
		alison.setId(2);//Modificamos valor actual, asignando por argumento
		System.out.println(adrian.getId()); //Muestra valor actual
		adrian.setId(18);//Modificamos valor actual, asignando por argumento
		
		//Ejercicio pag 379 por resolver
		/*public static float crearEstudiante(String... args) {
			return Estudiante.id=id;
			return Estudiante.edat=edat;
			return Estudiante.telefono=telefono;
			return Estudiante.numeroDeNotas=numeroDeNotas;
			return Estudiante.sumaDeNotas=sumaDeNotas;
			return Estudiante.notaMedia=notaMedia;
		}*/
		
	}
}
