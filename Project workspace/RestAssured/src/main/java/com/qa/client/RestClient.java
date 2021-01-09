package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;

import okhttp3.internal.http2.Header;
//import org.json.JSONObject;;

public class RestClient {
	
	// 1. GET Method
	
	public void get(String url) throws ClientProtocolException, IOException {
		
		CloseableHttpClient httpclient =  HttpClients.createDefault();
		
		HttpGet httpGet = new HttpGet(url);  // http GET request
		
		CloseableHttpResponse closeablehttpresp =  httpclient.execute(httpGet);  // hit the GET URL
		
		int statuscode = closeablehttpresp.getStatusLine().getStatusCode();
		
		// Statuscode
		
		System.out.println("Status code --> "+statuscode);
		
		// Json string
		
		String Responsestring = EntityUtils.toString(closeablehttpresp.getEntity(), "UTF-8");
		
		org.json.JSONObject responseJson = new org.json.JSONObject(Responsestring);
		
		System.out.println("Response JSON from API : "+responseJson);
		
		//All headers
		
		org.apache.http.Header[] headerarray = closeablehttpresp.getAllHeaders();
		
		HashMap<String, String> allheaders = new HashMap<String, String>();
		
		for(org.apache.http.Header header : headerarray) {
			allheaders.put(header.getName(), header.getValue());
		}
		System.out.println("Headers Array --->"+allheaders);
	}
	
	

}
