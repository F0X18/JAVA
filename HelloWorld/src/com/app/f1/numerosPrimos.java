package com.app.f1;

public class numerosPrimos {

	public static void main(String[] args) {
		int numeroPrimos=100;
		boolean primoSiNo=true;
		for(int i=numeroPrimos-1; i>1; i--){
		if(numeroPrimos%i ==0) {
			primoSiNo=false;
			}
		}	
		if(primoSiNo) {
		System.out.printf("el %d es primo o <=  1", numeroPrimos).println();
		}else {
		System.out.printf("el %d no es primo", numeroPrimos).println();
		}
	}
}
