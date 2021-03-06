// Hibernate recomienda utilizar las librer?as de JPA (un est?ndar) para importar
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
// indica que la clase se convierte en una clase entidad
@Entity
//indica que realice un mapeo entre esta clase y la tabla estudiante
@Table(name="estudiante")
public class Estudiante {
	// el atributo id ser? una clave primaria ?nica
	@Id
	// autoincremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/* en este caso (y en los siguientes), el atributo name es redundante porque tiene el
	mismo nombre que tendr? la columna de la base de datos */
	// id (atributo) --> id (columna en la tabla estudiante)
	@Column(name="id")
	private int id;
	// nombre (atributo) --> nombre (columna en la tabla estudiante)
	@Column(name="nombre")
	private String nombre;
	// apellidos (atributo) --> apellidos (columna en la tabla estudiante)
	@Column(name="apellidos")
	private String apellidos;
	// edad (atributo) --> edad (columna en la tabla estudiante)
	@Column(name="edad")
	private int edad ;
	// es obligatorio que exista un constructor por defecto
	public Estudiante() {}
	// es recomendable definir un constructor parametrizado con todos los atributos (excepto el id)
	// este m?todo puede generarse autom?ticamente con Eclipse
	public Estudiante(String nombre, String apellidos, int edad) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	}
	
	// para depuraci?n es recomendable definir un m?todo *toString* que incluye atributos y valores
	// este m?todo puede generarse autom?ticamente con Eclipse
	@Override
	public String toString() {
	return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" +
	edad + "]";

}

public Integer getId() {
return id;
}
public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public String getApellidos() {
return apellidos;
}
public void setApellidos(String apellidos) {
this.apellidos = apellidos;
}
public int getEdad() {
return edad;
}
public void setEdad(int edad) {
this.edad = edad;
}
}
