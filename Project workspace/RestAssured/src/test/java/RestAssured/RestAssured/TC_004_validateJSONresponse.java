package RestAssured.RestAssured;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_004_validateJSONresponse {
	
	
	@Test
	void getuserdetails() {	
		
		// Specify baseURI
		RestAssured.baseURI  = "https://reqres.in/api/users/";
		
		//Request object
		RequestSpecification httprequest = RestAssured.given();
		
		// Response object
		Response response = httprequest.request(Method.GET, "/2");
		
		// Print response in console
		String respbody = response.getBody().asString();
		
		System.out.println("Body is: "+respbody);
		
		Assert.assertEquals(respbody.contains("2"), true);	
		
		JsonPath jsonpath = response.jsonPath();
		
		System.out.println(jsonpath.get("id"));
		System.out.println(jsonpath.get("email"));
		System.out.println(jsonpath.get("first_name"));
		System.out.println(jsonpath.get("last_name"));
		System.out.println(jsonpath.get("avatar"));
				
	
		}
}