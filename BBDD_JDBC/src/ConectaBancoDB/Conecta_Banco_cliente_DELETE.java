package ConectaBancoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conecta_Banco_cliente_DELETE {

	public static void main(String[] args) {
		

		try {
			
			//paso 1
			Connection conexionbanco =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			System.out.println("esta conectado\n");
			//paso 2
			Statement miStatement=conexionbanco.createStatement();
			System.out.println("creado statement");
			//paso 3 genero los datos a eliminar de cliente
			String eliminacionSQL= "DELETE FROM cliente where id='2'";
			//paso 4 inserto la eliminacion de cliente
			miStatement.executeUpdate(eliminacionSQL);
			System.out.println("Datos eliminados correctamente");
			
		
			
		}
		catch (Exception e) {
			System.out.println("no esta conectado u otro error");
			e.getStackTrace();

	}




	}

}
