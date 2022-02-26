package poo;

public class EVA1_5_CLASE_COMPUTADORA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objecto
		Computadora c1 = new Computadora();
		//Llamar al metodo
		c1.setModelo("Intel Core i9");
		c1.setMemoriaRam(64);
		c1.setWindows(11);
		c1.setMemoriaIn(32);
		c1.setCapacidad(512);
		c1.setDiaPant(43.9);
		c1.setPeso(43.9);
		//Mostrar
		System.out.println("Modelo: "+c1.getModelo());
		System.out.println("Memoria Ram: "+c1.getMemoriaRam()+" GB");
		System.out.println("MemoriaInterna: "+c1.getMemoriaIn()+" GB");
		System.out.println("Capacidad total de almacenajea: "+c1.getCapacidad()+" GB");
		System.out.println("Diagonal de la pantalla: "+c1.getDiaPant()+" Cm");
		System.out.println("Windows: "+c1.getWindows()+" Home");
		System.out.println("Peso: "+c1.getPeso()+" Kg");
	}

}
//Clase Computadora
	class Computadora{
		private String Modelo;
		private int MemoriaRam,MemoriaIn,Capacidad,Pixeles,Windows;
		private double DiaPant,Peso;
		//Metodos set
		public void setModelo(String Mod) {
			// TODO Auto-generated method stub
			Modelo=Mod;
			
		}

		public void setMemoriaRam(int Ram) {
			// TODO Auto-generated method stub
			MemoriaRam=Ram;
			
		}
		public void setMemoriaIn(int In) {
			// TODO Auto-generated method stub
			MemoriaIn=In;
			
		}
		public void setCapacidad(int Ca) {
			// TODO Auto-generated method stub
			Capacidad=Ca;
			
		}
		public void setDiaPant(double Dp) {
			// TODO Auto-generated method stub
			DiaPant=Dp;
			
		}
		public void setWindows(int Win) {
			// TODO Auto-generated method stub
			Windows=Win;
			
		}
		public void setPeso(double Pe) {
			// TODO Auto-generated method stub
			Peso=Pe;
			
		}
		//Metodos Get
		public String getModelo() {
			// TODO Auto-generated method stub
			return Modelo;
		}
		
		public int getMemoriaRam() {
			// TODO Auto-generated method stub
			return MemoriaRam;
		}
		public int getMemoriaIn() {
			// TODO Auto-generated method stub
			return MemoriaIn;
		}
		public int getCapacidad() {
			// TODO Auto-generated method stub
			return Capacidad;
		}
		public double getDiaPant() {
			// TODO Auto-generated method stub
			return DiaPant;
		}
		public int getWindows() {
			// TODO Auto-generated method stub
			return Windows;
		}
		public double getPeso() {
			// TODO Auto-generated method stub
			return Peso;
		}
	
	}