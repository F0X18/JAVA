package com.app.f2;
import java.util.*;
public class ejerciciospag357 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un numero: ");                                                         
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 0; i<=10; i++){
             System.out.println(n + " X " + i + " = " + n*i); 
	}

}
}