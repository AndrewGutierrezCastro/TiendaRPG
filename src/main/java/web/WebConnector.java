package web;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import archivo.ManejoArchivo;

public class WebConnector {
	/*	NO USAR......
	 * WebConnector webconnector = new WebConnector();
	 * webconnector.createRequest("keyword"); webconnector.execute();
	 * String data = webconnector.getResponse().body().string(); 
	 * ManejoArchivo.writeText("ARCO", data);
	 */
	
	private OkHttpClient client;
	private Request request;
	private Response response;
	
	public WebConnector() {
		
		response = null;
		
		client = new OkHttpClient();
		
		request = null;
	}
	
	public void createRequest(String pKeyword) {
		request = new Request.Builder()
				.url("https://amazon-product-reviews-keywords.p.rapidapi.com/product/search?category=aps&country=US&keyword="+pKeyword)
				.get()
				.addHeader("x-rapidapi-host", "amazon-product-reviews-keywords.p.rapidapi.com")
				.addHeader("x-rapidapi-key", "a62d61c17bmsh1029f76a7d182bfp1d92c8jsn53ae89fe0281")
				.build();
	}
	
	public void execute() {
		try {
			response = client.newCall(request).execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
	
	
}
