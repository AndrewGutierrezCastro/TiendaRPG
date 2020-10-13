package web;

import java.io.IOException;

import archivo.ManejoArchivo;

public class WebRequester {
	
	public static void createDataFiles() throws IOException {
		WebConnector webconnector = new WebConnector();
		
		for (Keywords keyword : Keywords.values()) {	
			webconnector.createRequest(keyword.keyword); 
		    webconnector.execute();
			String data = "";
			if(data.length() >= 10000) {
				data = webconnector.getResponse().body().string();
				
				ManejoArchivo.writeText(keyword.toString(), data);
			}
		}
		
	}
}
