package poo;

public class EVA1_10_COPIA_OBJETOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prueb obj1 = new Prueb();
		System.out.println("Dirección: "+obj1);
		obj1.x=100;
		System.out.println("Valor de x =  "+obj1.x);
		//Prueba de respaldo
		Prueb respaldo= new Prueb();
		respaldo.x = obj1.x;
		System.out.println("Valor de x en respaldo = "+respaldo.x);
		//Modificar el respaldo
		respaldo.x = 0;
		System.out.println("Valor de x en obj1 = "+obj1.x);
		System.out.println("Valor de x en respaldo = "+respaldo.x);
		//Imprimir direcciones de memoria
		System.out.println("Obj1 = "+obj1);
		System.out.println("Respaldo = "+respaldo);
		if(obj1 ==respaldo) {
			System.out.println("Son el mismo objeto");
		}
		else {
			System.out.println("Son diferentes");
		}
	}

}
	class Prueb{
		public int x;
	}