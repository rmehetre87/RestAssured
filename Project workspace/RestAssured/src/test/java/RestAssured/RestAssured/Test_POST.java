package RestAssured.RestAssured;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class Test_POST {
	
	@Test
	public void Test_01() {
		
		/*Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "Rahul");
		map.put("job", "Tester");
		map.put("Salary", "50000");
		
		System.out.println(map);
		*/
		
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
			when().post("https://reqres.in/api/users").
				then().statusCode(201);
		
		
	}
	
}

