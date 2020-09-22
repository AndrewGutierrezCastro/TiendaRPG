package web;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class WebConnector {
	private OkHttpClient client;
	private Request request;
	private Response response;
	
	public WebConnector() {
		
		response = null;
		
		client = new OkHttpClient();
		
		request = new Request.Builder()
				.url("https://amazon-product-search-api.p.rapidapi.com/")
				.get()
				.addHeader("x-rapidapi-host", "amazon-product-search-api.p.rapidapi.com")
				.addHeader("x-rapidapi-key", "77827080bbmsh4cdae57bd6c16c7p158252jsn619c63e614c3")
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
