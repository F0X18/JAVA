import java.util.Scanner;


public class ejerciciorproyecto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("introduce un numero por pantalla");
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt();
		
		if (numero==1) {
		System.out.println("1 --> Gestores");
		}else if(numero==2) {
		System.out.println("2 --> Clientes");
		}else if(numero==3) {
		System.out.println("3 --> Transferencias");
		}else if (numero==4) {
		System.out.println("4 --> Mensajes");
		}else if(numero==5) {
		System.out.println("5 --> Préstamos");
		}else if(numero==6) {
		System.out.println("6 --> Salir");
		}else {
		System.out.println("no has introducido el numero adecuado");
			
		}
		keyboard.close();
	}

}
