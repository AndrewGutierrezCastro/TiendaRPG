package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.vTienda;


public class ControladorTienda implements ActionListener{
	
	private vTienda ventana;
	
	public ControladorTienda() {
		ventana = new vTienda(this);
		ventana.cargar();
	}

	public void actionPerformed(ActionEvent arg0) {
		
		System.out.println(arg0.getActionCommand());
		switch(arg0.getActionCommand()) {
		case "COMPRAR":
			//TODO Llamar Compra de item
			break;
		case "VENDER":
			//TODO Llamar Venta de item
			break;
		case "EQUIPAR":
			//TODO Llamar Equipar item
			break;
		}
		
	}

}
