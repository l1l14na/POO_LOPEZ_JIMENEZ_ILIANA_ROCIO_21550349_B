package poo;

public class EVA1_3_MOD_ACCESO {
	public static void main(String[] args) {
		Personas per1 = new Personas();
		per1.setId("21550349");
		per1.setNombre("Liliana");
		per1.setEdad(18);
		System.out.println("Nombre: "+per1.getNombre());
		System.out.println("Id: "+per1.getId());
		System.out.println("Edad: "+per1.getEdad());
		System.out.println();
		Personas per2 = new Personas();
		per2.setId("21550349");
		per2.setNombre("Liliana 2");
		per2.setEdad(18);
		System.out.println("Nombre: "+per1.getNombre());
		System.out.println("Id: "+per1.getId());
		System.out.println("Edad: "+per1.getEdad());
	}
}
class Personas{
	//Atributos (Variables)
	private String id;
	private String nombre;
	private int edad;
	//Comportamiento (métodos)
	//Para leer y modificar los atributos, usamos métodos de lectura/escritura
	//Leer --> Get
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	//Asignar --> Set
	public void setId(String valor) {
		id=valor;
		
	}
	public void setNombre(String valor) {
		nombre=valor;
		
	}
	public void setEdad(int valor) {
		edad=valor;
		
	}
 
}
