package ConectaBancoDB;
import java.sql.*;
public class Conecta_Banco {

	public static void main(String[] args) {
	

		try {
			
			//paso 1
			Connection conexion =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
			System.out.println("esta conectado\n");
			//paso 2
			Statement miStatement=conexion.createStatement();
			System.out.println("creado statement");
			//paso 3 conexion con la DB cliente
			ResultSet miResultSet=miStatement.executeQuery("SELECT * FROM cliente");
			System.out.println("creado resultset");
			//paso 4
			while(miResultSet.next()) {
				System.out.println(miResultSet.getString("id") + " " + miResultSet.getString("usuario") +" "+ miResultSet.getString("password"));
				System.out.println(miResultSet.getString("id_gestor") + " " + miResultSet.getString("correo") +" "+ miResultSet.getString("saldo" ));
		}
			
		}
		catch (SQLException e) {
			System.out.println("no esta conectado");
			e.getStackTrace();

	}

}
}