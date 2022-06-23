package ConectaBancoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conecta_Banco_Mensaje_INSERTINTO {

	public static void main(String[] args) {

		try {
			
			//paso 1
			Connection conexionbanco =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			System.out.println("esta conectado\n");
			//paso 2
			Statement miStatement=conexionbanco.createStatement();
			System.out.println("creado statement");
			//paso 3 genero un nuevo mensaje con atributos 
			String instruccionSQL= "INSERT INTO mensaje (id, texto) VALUES ('2', 'Chanchitofeliz')";
			//paso 4 inserto los datos del nuevo mensaje en la DB
			miStatement.executeUpdate(instruccionSQL);
			System.out.println("Datos insertados correctamente");
			
			
		
			
		}
		catch (Exception e) {
			System.out.println("no esta conectado u otro error");
			e.getStackTrace();

	}

}


	}

