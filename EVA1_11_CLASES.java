package poo;

public class EVA1_11_CLASES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1 = new Person();
	}

}
class Person{
	private String id;
	private String nombre;
	private String edad;
	
	//this --> este
	//apuntador --> al objeto actual
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
}