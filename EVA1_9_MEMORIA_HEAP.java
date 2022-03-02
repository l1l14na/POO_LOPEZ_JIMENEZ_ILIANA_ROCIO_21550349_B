package poo;

public class EVA1_9_MEMORIA_HEAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		Pruebas obj1 = new Pruebas();
		System.out.println(obj1);
		System.out.println(obj1.valor);
		Pruebas obj2 = new Pruebas();
		System.out.println(obj2);
		System.out.println(obj2.valor);
		obj2 = null; //elimino la referencia, el garbaje collector lo elimina
		//cuando no eliminan objetos y no se usan en el programa
	}

}
	class Pruebas{
		int valor=100;
	}
