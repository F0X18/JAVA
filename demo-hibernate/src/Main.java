import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		/*
		creación del objeto SessionFactory. Hibernate buscará por defecto el archivo
		hibernate.cfg.xml, aunque no se le indique, por lo que no es necesario establecerlo
		como parámetro en el método configure
		*/
		System.out.println("inicio de conexion");
		SessionFactory factory = new Configuration()
		.configure("hibernate.cfg.xml")
		.addAnnotatedClass(Estudiante.class)
		.buildSessionFactory();
		// creación de un objeto de tipo Session a partir del SessionFactory
		Session session = factory.getCurrentSession();
		System.out.println("conexion realizada");
		
		
		try {
			// obtención/manipulación/almacenamiento de objetos
			// crea un nuevo objeto
			Estudiante estudiante = new Estudiante("Marcos", "González", 25);
			// comienza la transacción
			session.beginTransaction();
			// guarda el objeto
			session.save(estudiante);
			// finalizar y guardar la transacción (los cambios se efectúan en la base de datos)
			session.getTransaction().commit();
			System.out.println(estudiante.getId());
			
			Estudiante estudiante1 = new Estudiante("Marquitos", "perez", 26);
		//null (en caso de que id haya sido declarado como Integer) o 0 (en caso de int)
				System.out.println(estudiante1.getId());
		//almacenamiento del objeto
				session.beginTransaction();
				session.save(estudiante);
				session.getTransaction().commit();
		//devuelve un número entero (igual o mayor que 1)
				System.out.println(estudiante1.getId());
			}
			finally {
			// cierre del objeto SessionFactory
			factory.close();
			}
		}
	}

	
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	
	
