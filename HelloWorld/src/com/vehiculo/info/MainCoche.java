package com.vehiculo.info;

public class MainCoche {

	public static void main(String[] args) {
		coche honda = new coche(3);
		coche opel = new coche(105.0f,19.0f);
		coche audi = new coche(0.0f , 350.0f , 2, 0);
		//invocaci�n de los m�todos est�ticos
		//Primer m�todo le pasamos 350CV y nos convierte a 259.26Kw
		float kw = coche.convertirCvKw(350.0f);
		//Primer m�todo le pasamos 259.26Kw y nos convierte a 350CV
		float cv = coche.convertirKwCv(kw);
		
		//Mostrar el resultado de los dos c�lculos de los m�todos static
		//System.out.println(kw); //259.26Kw
		//System.out.println(cv); //350CV
		
		//Tambi�n se puede llamar al m�todo estatico desde un objeto
		//audi.convertirCvKw(350.0f);
		//No necesita invocar a trav�s de un Objeto
		System.out.println(coche.factorConversionCvKw);
		coche.factorConversionCvKw = 2.36f;
		System.out.println(coche.factorConversionCvKw);
	}

}