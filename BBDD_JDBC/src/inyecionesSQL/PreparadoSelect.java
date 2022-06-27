package inyecionesSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparadoSelect {

	public static void main(String[] args) {
		try {
			
			//paso 1
			Connection conexionbanco =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			System.out.println("esta conectado\n");
			//paso 2
			PreparedStatement ps = conexionbanco.prepareStatement("SELECT * from gestor WHERE id IN (?)");
			// se sustituye la primera aparición del carácter ? con el valor 3
			ps.setInt(1, 3);
			// se sustituye la segunda aparición del carácter ? con el valor 4
			ps.setInt(2, 4);
			// se ejecuta la instrucción SQL siguiente:
			// SELECT * from gestor WHERE id IN (3,4)
			ResultSet resultados = ps.executeQuery();
			System.out.println("Listado de gestores: ");
			while (resultados.next()) {
			System.out.println("Gestor " + resultados.getInt("id"));
			System.out.println("Usuario: " + resultados.getString("usuario"));
			System.out.println("Password: " + resultados.getString("password"));
			System.out.println("Correo: " + resultados.getString("correo"));
			System.out.println("...");
			}
			
		
			
		}
		catch (Exception e) {
			System.out.println("no esta conectado u otro error");
			e.getStackTrace();

	}

}


	}

