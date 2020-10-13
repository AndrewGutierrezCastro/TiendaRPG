import java.io.IOException;

import javax.swing.ImageIcon;

import archivo.ManejoArchivo;
import controlador.ControladorTienda;
import modelo.Categoria;
import modelo.CreadorObjetos;
import modelo.Producto;
import web.WebConnector;
import web.WebRequester;

public class Main {

	public static void main(String[] args) throws IOException {
		//WebRequester.createDataFiles();		
		new ControladorTienda();
	}
}
