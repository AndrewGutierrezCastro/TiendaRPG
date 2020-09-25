import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import controlador.ControladorTienda;
import modelo.Dummy;


public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Hola mundo");
		
		Document doc = Jsoup.parse(Dummy.response);
		
		Element link = doc.select("a").first();
		
		String text = doc.body().text(); // "An example link"
		String linkHref = link.attr("href"); // "http://example.com/"
		String linkText = link.text(); // "example""
		
		Element products = doc.html(doc.body().child(1).child(1).child(22).child(3).child(0).childNode(0).toString());
		
		//ERROR JsonObject json = new JsonParser().parse(products.text()).getAsJsonObject();
		//System.out.println(json);
		
		
		new ControladorTienda();
		}
}
