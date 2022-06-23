package ConectaBancoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conecta_Banco_Transferencias_SELECT {

	public static void main(String[] args) {
try {
			
			//paso 1
			Connection conexionbanco =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			System.out.println("esta conectado\n");
			//paso 2
			Statement miStatement=conexionbanco.createStatement();
			System.out.println("creado statement");
			//paso 3 conexion con la DB transferencia
			ResultSet miResultSet=miStatement.executeQuery("SELECT * FROM transferencia");
			System.out.println("creado resultset");
			//paso 4
			while(miResultSet.next()) {
				System.out.println(miResultSet.getString("id") + " " + miResultSet.getString("importe") +" "+ miResultSet.getString("concepto"));
			
			
		}
		
			
		}
		catch (SQLException e) {
			System.out.println("no esta conectado");
			e.getStackTrace();

	}

}


	




	}


