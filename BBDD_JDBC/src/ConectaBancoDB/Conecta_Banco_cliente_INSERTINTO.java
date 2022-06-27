package ConectaBancoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conecta_Banco_cliente_INSERTINTO {

	public static void main(String[] args) {

		try {
			
			//paso 1
			Connection conexionbanco =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			System.out.println("esta conectado\n");
			//paso 2
			Statement miStatement=conexionbanco.createStatement();
			System.out.println("creado statement");
			//paso 3 genero un nuevo cliente con atributos 
			String instruccion1SQL= "INSERT INTO cliente (usuario) VALUES ('Chanchito')";
			//paso 4 inserto los datos del nuevo cliente en la DB
			miStatement.executeUpdate(instruccion1SQL);
			System.out.println("Datos insertados correctamente");
			
			
		
			
		}
		catch (Exception e) {
			System.out.println("no esta conectado u otro error");
			e.getStackTrace();

	}

}


	}


