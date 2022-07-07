import java.sql.Connection;
import java.sql.DriverManager;

public class main2 {

	public static void main(String[] args) {
		String jdbcUrl= "jdbc:mysql://localhost:3306/demo-hibernate";
		String usuario= "root";
		String password= "";
		
		
		try {
			
			System.out.println("Conectando a la base de datos:" + jdbcUrl);
			
			Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, password);
			
			System.out.println("Conexion exitosa");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	