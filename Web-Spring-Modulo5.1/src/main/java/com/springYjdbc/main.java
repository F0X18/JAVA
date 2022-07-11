package com.springYjdbc;

import java.sql.DriverManager;

public class main {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hibernate-demo";
		String usuario = "root";
		String password ="";
		
		try {
			System.out.println("conectando con la base de datos:" + jdbcUrl );
			Conection con= DriverManager.getConnection(jdbcUrl,usuario,password);
			System.out.println("conexion exitosa");
			
		}
		catch(Exception e) {
			e.printStackTrace();
	}
	}

}
