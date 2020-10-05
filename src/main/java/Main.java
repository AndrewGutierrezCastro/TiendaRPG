import java.io.IOException;

import archivo.ManejoArchivo;
import controlador.ControladorTienda;
import modelo.CreadorObjetos;
import modelo.Producto;
import web.WebConnector;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Hola mundo");
		
		
		
		/*
		 * for (Tipo tipo : Tipo.values()) {
		 * System.out.println("\n\n----------------------"+tipo.toString()+
		 * "--------------------------");
		 * 
		 * for (Producto producto : CreadorObjetos.getListProducts("POCION")){
		 * System.out.println(producto.toString()); }
		 * 
		 * }
		 */
	
		
		 
		
		
		new ControladorTienda();
		}
}
