package poo;

public class EVA1_14_STATIC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FormulasMatematicas misFor = new FormulasMatematicas();
		double area = misFor.AreaCirculo(100);
		System.out.println("Area del círculo: "+area);*/
		double area= FormulasMatematicas.AreaCirculo(50);
		System.out.println("Area del círculo: "+area);
		double areat= FormulasMatematicas.AreaTriangulo(10.10, 9.5);
		System.out.println("Area del triángulo: "+areat);
		FormulasMatematicas miObj = new FormulasMatematicas();
		miObj.ImprimirMensaje();
		
	
	}

}
class FormulasMatematicas {
	static int valor = 100;
	public static double AreaCirculo(double radio) {
		double area;
		area= Math.PI*(radio*radio);
		return area;
	}
	public static double AreaTriangulo(double base, double altura) {
		double area;
		area= (base*altura)/2.00;
		AreaCirculo(10);
		return area;
	}
	public void ImprimirMensaje() {
		System.out.println("Hola mundo"+AreaCirculo(100));
	}
}
