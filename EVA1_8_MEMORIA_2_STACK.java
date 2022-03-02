package poo;

public class EVA1_8_MEMORIA_2_STACK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicia Main");
		A();
		System.out.println("Termina Main");
	}
	public static void A() {
		System.out.println("inicia A()");
		B();
		System.out.println("Termina A()");
	}	
	public static void B() {
		System.out.println("Inicia B()");
		System.out.println("Termina B()");
	}	
}