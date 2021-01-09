package RestAssured.RestAssured;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
	
	@Test
	void getuserdetails() {
		
		// Specify baseURI
		RestAssured.baseURI  = "https://reqres.in/api/users";
		
		//Request object
		RequestSpecification httprequest = RestAssured.given();
		
		// Response object
		Response response = httprequest.request(Method.GET, "/2");
		
		// Print response in console
		String respbody = response.getBody().asString();
		
		System.out.println("Response body is :" +respbody);
		
		//statuscode validation
		int statuscode = response.statusCode();
		System.out.println("Status code is :"+statuscode);
		
		assertEquals(statuscode, 200);
		
		//status line verification
		String contenttype = response.contentType();
		
		System.out.println("content-type :"+contenttype);
		assertEquals(contenttype, "application/json; charset=utf-8");
		
		
	}
	

}
