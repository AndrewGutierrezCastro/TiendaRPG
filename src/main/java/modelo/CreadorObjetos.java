package modelo;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

public class CreadorObjetos {
	
	public static List<Producto> getListProducts(JsonObject obj) {
		Gson gson = new Gson();
		JsonObject jo = (JsonObject) obj; //Casteo de objeto a objeto Json
        String data = jo.get("data").toString(); //Tener un string que es la info de la parte de data
        Type tipoListaEmpleados = new TypeToken<List<Producto>>(){}.getType(); //crear un type para los productos
    	return gson.fromJson(data, tipoListaEmpleados); //crear la lista de los productos
	}
}
