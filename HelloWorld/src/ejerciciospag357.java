import java.util.*;
public class ejerciciospag357 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un n�mero entero: ");                                                         
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=2; i++){
             System.out.println(n + " * " + i + " = " + n*i); 
	}

}
}