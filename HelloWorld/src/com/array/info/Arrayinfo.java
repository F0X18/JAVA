package com.array.info;
import java.lang.*;
import java.util.*;
import java.util.Arrays;
public class Arrayinfo {

	public static void main(String[] args) {
		Object a[] = { "manzana", "peras", true, 55, 2.3, 33 };
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			}
		
		
		int b[] = new int[6];
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
			}
		
		int c[] = { 10, 20, 30, 40, 50, 60 };
		
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
			}
		int numeros[] = { 24, 4, 23, 55, 34, 33 };
		// [24, 4, 23, 55, 34, 33]
		System.out.println(Arrays.toString(numeros));
		int[] numeros2 = new int[5];
		// cambia todos los valores del array a 100
		Arrays.fill(numeros2, 100);

	}

}
