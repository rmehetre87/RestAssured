package RestAssured.RestAssured;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class DataDrivenTest {
	
	@DataProvider(name = "datafortest")
	public Object[][] DataForPost() {
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Rahul";
		data[0][1] = "Tester";
		data[0][2] = 40000;
		
		data[1][0] = "Madhuri";
		data[1][1] = "Devloper";
		data[1][2] = 90000;		
		
		return data; 
	}
	
	
	@Test(dataProvider = "datafortest")
	public void Test_01(String firstname, String job, int salary ) {
		
		JSONObject req = new JSONObject();
		
		req.put("name", firstname);
		req.put("job", job);
		req.put("Salary", salary);
				
		given().
		header("Content-type", "Applications/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(req.toJSONString()).
			when().post("https://reqres.in/api/users").
				then().statusCode(201);
		
		
	}

}
