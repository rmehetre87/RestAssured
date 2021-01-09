package RestAssured.RestAssured;
import static org.testng.Assert.assertEquals;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_003_GET_ReadallHeaders {
	
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
		
		System.out.println("Body is: "+respbody);
		
		Headers allheaders = response.headers();  // capture all headers from response
		
		for(Header header : allheaders) {
			
			System.out.println(header.getName()+" = "+header.getValue());
					
			
		}
		
		
		
	}
	
}