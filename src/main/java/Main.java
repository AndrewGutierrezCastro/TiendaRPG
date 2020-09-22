import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import web.WebConnector;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Hola mundo");
		WebConnector conector = new WebConnector();
		conector.execute();
		Document doc = Jsoup.parse(conector.getResponse().body().string());
		
		Element link = doc.select("a").first();
		
		String text = doc.body().text(); // "An example link"
		String linkHref = link.attr("href"); // "http://example.com/"
		String linkText = link.text(); // "example""
		System.out.println(doc.body().child(1).child(1).child(22).child(3).child(0).childNode(0));
		}
}
