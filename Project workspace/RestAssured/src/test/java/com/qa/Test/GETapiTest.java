package com.qa.Test;

import java.io.IOException;
import java.util.Properties;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GETapiTest extends TestBase{
	
	TestBase testbase;
	String Serviceurl;
	String apiURL;
	String url;
	RestClient restclient;
	
	@BeforeMethod
	public void setup() throws ClientProtocolException, IOException {
			
		testbase = new TestBase();
		Serviceurl = properties.getProperty("URL");
		apiURL = properties.getProperty("serviceURL");	
		url = Serviceurl + apiURL;
	}
	
	@Test
	public void getAPITest() throws ClientProtocolException, IOException {
		
		restclient = new RestClient();
		restclient.get(url);
		
		
	}
	
	

}
