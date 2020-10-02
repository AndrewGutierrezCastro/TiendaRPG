import java.io.IOException;

import controlador.ControladorTienda;
import modelo.CreadorObjetos;
import modelo.DatosEstadisticas;
import modelo.Estadisticas;
import modelo.Producto;
import modelo.Tipo;



public class Main {

	public static void main(String[] args) throws IOException {
		
		/*System.out.println("Hola mundo");
		
		
		
		for (Tipo tipo : Tipo.values()) {
			System.out.println("----------------------"+tipo.toString()+ "--------------------------\n\n"); 
			for (Producto producto : CreadorObjetos.getListProducts(tipo)){
				System.out.println(producto.toString()); 
			}
			  
		 }
		 */
		
		
		
		new ControladorTienda();
		}
}
