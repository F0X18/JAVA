package com.vehiculo.info;

public class coche extends Vehiculo {
	
	public coche() {
		super(10,4,0);
		this.caballos = 0.0f;
		
	}
	/*public coche(int asientos) {
		this.velocidad = 5.0f;
		this.caballos = 0.0f;
		this.asientos = asientos;
		this.orientacionRuedas = 0;
	}*/
	/*public coche(float velocidad, float caballos) {
		this.velocidad = velocidad;
		this.caballos = caballos;
		this.asientos = 5;
		this.orientacionRuedas = 0;
	}*/
	/*public coche(float velocidad, float caballos, int asientos, int orientacionRuedas) {
		this.velocidad = velocidad;
		this.caballos = caballos;
		this.asientos = asientos;
		this.orientacionRuedas = orientacionRuedas;
	}*/
	private float caballos;
	public coche(float velocidad,float caballos, int asientos, int orientacionRuedas) {
		super(velocidad,asientos,orientacionRuedas);
		this.caballos= caballos;
		
	}
	public static float factorConversionCvKw =2.3f;
	


	//M�todo static que convierte los cv a kw
	public static float convertirCvKw(float caballos) {
		return caballos / factorConversionCvKw;
	}
	//M�todo static que convierte los kw a cv
	public static float convertirKwCv(float kilowatios) {
		return kilowatios * factorConversionCvKw;
	}
}