package RestAssured.RestAssured;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_GET {
	
	@Test
	public void Test_01() {
		
		given().get("https://reqres.in/api/users?page=2").
		then().statusCode(200).
		body("data.id[1]", equalTo(8)).
		body("data.first_name", hasItems("Michael", "Lindsay"));
		
		
		
		
		
	}

}
