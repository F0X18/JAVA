
public abstract class Persona {
	//atributos
	protected int id;
	protected int edad;
	protected int telefono;
	
	//contructor
	public Persona(){
	this.id=18;
	this.edad=18;
	this.telefono=999999999;
	}
	
	//metodo
	public void mostrarInfo() {
		getid();
		getedad();
		gettelefono();
	}
	
	public int getid() {
		return id;
	};
	public int getedad() {
		return edad;
	};
	public int gettelefono() {
		return telefono;
	};
	//metodo abstracto
	public abstract void mostrarID();
}
