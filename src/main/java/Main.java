import java.io.IOException;

import web.WebConnector;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Hola mundo");
		WebConnector conector = new WebConnector();
		conector.execute();
		System.out.println(conector.getResponse().body().string());
	}

}
