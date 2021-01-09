package RestAssured.RestAssured;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * Unit test for simple App.
 */
public class Test01_GET 
{
   @Test
    public void Test_01()
    {
        Response response = get("https://reqres.in/api/users?page=2");
        
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
        
        System.out.println(response.asString());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("Content-type"));
        System.out.println(response.getTime());
        
        int Statuscode = response.getStatusCode();
        
        Assert.assertEquals(Statuscode, 200);
        
    }
   
   @Test
   void Test_02() {
	   
	   given()	
	   
	   		.get("https://reqres.in/api/users?page=2")
	   		
	   .then()
	   
	   		.statusCode(200);
	   		   
	   
	   
   }
   
   

   
   
}
