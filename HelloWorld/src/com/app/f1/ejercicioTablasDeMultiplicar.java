package com.app.f1;
import java.util.*;
public class ejercicioTablasDeMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un numero: ");                                                         
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " X " + i + " = " + n*i);
             for(int j=0;j<=10;j++) {
            	 System.out.println(j + " X " + i + " = " + j*i);{
             }

	}

}
}
}