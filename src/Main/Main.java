package Main;

import Web.WebConnector;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		Web.WebConnector conector = new WebConnector();
		conector.execute();
		System.out.println(conector.getResponse());
	}

}
