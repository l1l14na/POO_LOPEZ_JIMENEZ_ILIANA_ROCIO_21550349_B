package poo;

public class EVA1_4_CLASE_AUTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil miAuto = new Automovil();
		miAuto.setAño(2007);
		miAuto.setColor("Rojo Obscuro");
		miAuto.setMarca("Sentra");
		miAuto.setModelo("SER");
		miAuto.setPrecio(258400.505);
		
		System.out.println("Año: "+miAuto.getAño());
		System.out.println("Color: "+miAuto.getColor());
		System.out.println("Modelo: "+miAuto.getModelo());
		System.out.println("Precio: "+miAuto.getPrecio()+" MXN");
	}

}
class Automovil{
	private String marca;
	private String modelo;
	private String tipo;
	private int año;
	private String color; 
	private double precio;
	
	public void setMarca (String valor) {
		marca = valor;
	}
	public void setModelo (String valor) {
		modelo = valor;
	}
	public void setTipo (String valor) {
		tipo = valor;
	}
	public void setAño (int valor) {
		año = valor;
	}
	public void setColor (String valor) {
		color = valor;
	}
	public void setPrecio (double valor) {
		precio = valor;
	}
	public String getMarca () {
		return marca;
	}
	public String getModelo () {
		return modelo;
	}
	public String getTipo () {
		return tipo;
	}
	public int getAño () {
		return año;
	}
	public String getColor () {
		return color;
	}
	public double getPrecio () {
		return precio;
	}
	
}
