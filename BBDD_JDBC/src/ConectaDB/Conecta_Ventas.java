package ConectaDB;
import java.sql.*;

public class Conecta_Ventas {

	public static void main(String[] args) {
		
		
		try {
			
			//paso 1
			Connection conexion =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas", "root", "");
			System.out.println("esta conectado\n");
			//paso 2
			Statement miStatement=conexion.createStatement();
			System.out.println("creado statement");
			//paso 3
			ResultSet miResultSet=miStatement.executeQuery("SELECT * FROM productos");
			System.out.println("creado resultset");
			//paso 4
			while(miResultSet.next()) {
				System.out.println(miResultSet.getString("CÓDIGOARTÍCULO") + " " + miResultSet.getString("NOMBREARTÍCULO") +" "+ miResultSet.getDouble("PRECIO")*1.21+" "+"leuros");
				System.out.println(miResultSet.getString("SECCIÓN") + " " + miResultSet.getString("IMPORTADO") +" "+ miResultSet.getString("PAÍSDEORIGEN" ));
		}
			
		}
		catch (SQLException e) {
			System.out.println("no esta conectado");
			e.getStackTrace();
	}
		
}
}