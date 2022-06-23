package ConectaBancoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conecta_banco_cliente_UPDATE {

	public static void main(String[] args) {
		

		try {
			
			//paso 1
			Connection conexionbanco =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			System.out.println("esta conectado\n");
			//paso 2
			Statement miStatement=conexionbanco.createStatement();
			System.out.println("creado statement");
			//paso 3 genero la actualizacion de un cliente 
			String actualizacionSQL= "UPDATE clientes SET usuario=adrian where `id`=\"2\"";
			//paso 4 inserto los datos a actulizar
			miStatement.executeUpdate(actualizacionSQL);
			System.out.println("Datos actualizados correctamente");
			
			
		
			
		}
		catch (Exception e) {
			System.out.println("no esta conectado u otro error");
			e.getStackTrace();

	}

}


	}




