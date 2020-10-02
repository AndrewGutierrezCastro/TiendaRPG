import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import controlador.ControladorTienda;
import modelo.CreadorObjetos;
import modelo.DatosEstadisticas;
import modelo.Dummy;
import modelo.Estadisticas;
import modelo.Producto;


public class Main {

	public static void main(String[] args) throws IOException {
		
		/*System.out.println("Hola mundo");
		
		Document doc = Jsoup.parse(Dummy.response);
		
		Element products = doc.html(doc.body().child(1).child(1).child(22).child(3).child(0).childNode(0).toString());
		
		JsonObject obj = (JsonObject) new JsonParser().parse(products.toString().substring(10)); //Eliminar la parte de RESPONSE
        
    	for (Producto producto : CreadorObjetos.getListProducts(obj)) {
			System.out.println(producto);
			System.out.println();
		}*/

		
		new ControladorTienda();
		}
}
