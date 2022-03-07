package eva1_13_modifiers;

import vehiculos_sin_motor.Bicicletas;

public class EVA1_13_ACCESS_MODIFIERS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Clase automovil objeto
		Automovil miCarro= new Automovil();
		miCarro.setAño(2000);
		//Clase bicicletas objeto
		Bicicletas miBici= new Bicicletas();
		//Clase carretas objeto
		//Solo es visible para clases del mismo paquete 
		Carreta miCarreta= new Carreta();
	}

}
