package ConectaBancoDB;
import java.sql.*;
public class Conecta_Banco_cliente_SELECT {

	public static void main(String[] args) {
	

		try {
			
			//paso 1
			Connection conexionbanco =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			System.out.println("esta conectado\n");
			//paso 2
			Statement miStatement=conexionbanco.createStatement();
			System.out.println("creado statement");
			//paso 3 conexion con la DB cliente
			ResultSet miResultSet=miStatement.executeQuery("SELECT * FROM cliente");
			System.out.println("creado resultset");
			
			//paso 4 Mestro por consola los datos de todos los clientes
			while(miResultSet.next()) {
				System.out.println(miResultSet.getString("id") + " " + miResultSet.getString("usuario") +" "+ miResultSet.getString("password"));
			
			
		}
			
		}
		catch (Exception e) {
			System.out.println("no esta conectado u otro error");
			e.getStackTrace();

	}

}
}