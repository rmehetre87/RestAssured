package RestAssured.RestAssured;
import static org.testng.Assert.assertEquals;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_PUT_request {
	
	@Test
	void getuserdetails() {	
		
		// Specify baseURI
		RestAssured.baseURI  = "https://reqres.in/api/users";
		
		//Request object
		RequestSpecification httprequest = RestAssured.given();
		
		//Request payload sending along with post request
		 
		JSONObject Jsonobj = new JSONObject();
		
		Jsonobj.put("name", "Rahul");
		Jsonobj.put("job", "QA");
		Jsonobj.put("name", "Madhuri");
		Jsonobj.put("job", "Dev");
		
		httprequest.header("content-type", "application/json; charset=utf-8");
		
		httprequest.body(Jsonobj.toJSONString());
		
		// Response object
		Response response = httprequest.request(Method.POST, "/2");
		
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
		
		//String successcode = response.jsonPath().get();
		
	}
	
	
	
	

}
