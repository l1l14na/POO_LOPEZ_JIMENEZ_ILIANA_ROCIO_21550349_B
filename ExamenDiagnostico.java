package poo;

import java.util.Scanner;

public class ExamenDiagnostico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		String Operador;
		System.out.println("D�as de la semana");
		System.out.println("Ingresar N�mero: ");
		num=sc.nextInt();
		do {
		switch(num) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}	
		System.out.println("Desea salir");
		System.out.println("A.Si 	B.No");
		Operador = sc.next();
		System.out.println("Ingresar N�mero");
		num=sc.nextInt();
	}while(!Operador.equalsIgnoreCase("A"));

		
	}
	

}

