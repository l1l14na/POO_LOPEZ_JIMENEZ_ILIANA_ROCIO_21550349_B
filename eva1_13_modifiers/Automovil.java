package eva1_13_modifiers;

public class Automovil {
	private String modelo;
	private String marca;
	private int año;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		//EVA1_13_ACCESS_MODIFIERS x = new EVA1_13_ACCESS_MODIFIERS(); *Las dos clases se ven entre si
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}

	
	
}
class Carreta{//Modificador de acceso --> default
	private String marcas;

	public String getMarcas() {
		return marcas;
	}

	public void setMarcas(String marcas) {
		this.marcas = marcas;
	}
	
}
