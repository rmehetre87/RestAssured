package RestAssured.RestAssured;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;


public class Test_Delete {
	
	//@Test
	public void Test_01_Delete() {
				
			
				when().
				delete("https://reqres.in/api/users/2").
					then().statusCode(204).
					log().all();
			
			
		}
	
	
	@Test
	public void Test_02_PATCH() {
		
		JSONObject req = new JSONObject();
			
			req.put("name", "Rahul");
			req.put("job", "Tester");
			req.put("Salary", "50000");
			
			System.out.println(req);
			System.out.println(req.toJSONString());
			
			given().
			header("Content-type", "Applications/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(req.toJSONString()).
				when().patch("https://reqres.in/api/users/2").
					then().statusCode(200).log().all();
			
			
		}
		
	
	

}
