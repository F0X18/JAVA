public class MainEstudiante {

	public static void main(String[] args) {
		estudiante isaac = new estudiante();
		estudiante albert = new estudiante(3);
		estudiante laura = new estudiante(5,19);
		estudiante alison = new estudiante(5 , 25 , 696999999, 8 , 8 , 8.0);
		//Mostrar la id del estudiante albert solo si es visible, es decir, "public"
		//System.out.println(albert.id);
		System.out.println(isaac.getId());
		isaac.SetId(3);
		System.out.println(isaac.getId());
		System.out.println(isaac.getedat());
		isaac.Setedat(20);
		System.out.println(isaac.getedat());
		System.out.println(albert.gettelefono());
		albert.Settelefono(666666666);
		System.out.println(albert.gettelefono());
		System.out.println(laura.getnumeroDeNotas());
		laura.SetnumeroDeNotas(8);
		System.out.println(laura.getnumeroDeNotas());
		System.out.println(alison.getnotaMedia());
		alison.SetnotaMedia(9);
		System.out.println(alison.getnotaMedia());
		
	}
}