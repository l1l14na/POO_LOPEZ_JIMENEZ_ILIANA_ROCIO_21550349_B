package vehiculos_sin_motor;

import eva1_13_modifiers.Automovil;

public class Bicicletas {

	private int rodada;
	private String marca;
	private int precio;
	public int getRodada() {
		//Clase automovil objeto
		Automovil miCarro= new Automovil();
		//Clase carretas objeto
		//Solo es visible para clases del mismo paquete 
		//Carreta miCarreta= new Carreta(); Aquí no podemos ver esta clase el DEFAULT está en otro paquete
		return rodada;
	}
	public void setRodada(int rodada) {
		this.rodada = rodada;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
