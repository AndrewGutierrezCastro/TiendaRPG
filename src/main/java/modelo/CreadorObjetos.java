package modelo;

import java.lang.reflect.Type;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import archivo.ManejoArchivo;

public class CreadorObjetos {
	
	public static List<Producto> getListProducts(JsonObject obj) {
		Gson gson = new Gson();
		JsonObject jo = (JsonObject) obj; //Casteo de objeto a objeto Json
        String data = jo.get("products").toString(); //Tener un string que es la info de la parte de data
        Type tipoListaEmpleados = new TypeToken<List<Producto>>(){}.getType(); //crear un type para los productos
    	return gson.fromJson(data, tipoListaEmpleados); //crear la lista de los productos
	}
	
	public static List<Producto> getListProducts(String tipo){
		String data = ManejoArchivo.readText(tipo);
		Document doc = Jsoup.parse(data);
		Element products = doc.html(doc.body().toString());
		JsonObject obj = (JsonObject) new JsonParser().parse(products.toString());
		return CreadorObjetos.getListProducts(obj);
	}
}
