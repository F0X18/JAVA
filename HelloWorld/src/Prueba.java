
public class Prueba {

	public static void main(String[] args) {
		StringBuilder strb1 = new StringBuilder("hola a todos");
		StringBuilder strb2 = new StringBuilder(" hoy se cena");
		
		
		
		String str1 = strb1.toString();
		String str2 = strb2.toString();
		// reemplaza desde el �ndice 5 al �ndice 6 (1 car�cter) por la cadena de texto dd
		strb1.replace(6, 7, "dd");
		// hola dd todos
		System.out.println(strb1);
		// reemplaza desde el �ndice 5 al �ndice 22 (hasta el final del StringBuilder) por la cadena
		//de texto dd
		strb2.replace(7, 11, "dd");
		// hola dd
		System.out.println(strb2);
		StringBuilder strb = new StringBuilder("hola a todos");
		// reemplaza el car�cter del �ndice 2 del StringBuilder con el car�cter c
		strb.setCharAt(2, 'c');
	
		
	}

}
