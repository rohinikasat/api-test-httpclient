package com.apex.samples;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

import junit.framework.Assert;

//
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.HttpClient;
//
//import java.io.IOException;
//import java.net.http.HttpRequest;
//
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpHeaders;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;

public class HttpRestGet {
	
	@Test
	public void getMethod() throws Exception{
		//Creating a client
		CloseableHttpClient client = HttpClients.createDefault();
		
		//create a request
		HttpGet request = new HttpGet("http://localhost:3000/posts/320");
		
		//adding header
		request.addHeader("Content-Type", "application/json");
	
		//Execute command
		CloseableHttpResponse response = client.execute(request);
		
		int code = response.getStatusLine().getStatusCode();
		Assert.assertEquals(200, code);
	
	}
        
}
