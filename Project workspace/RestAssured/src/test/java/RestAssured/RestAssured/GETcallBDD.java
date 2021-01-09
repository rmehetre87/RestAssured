package RestAssured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class GETcallBDD {
	
	@Test(enabled=false)
	public void test_numberofcircuitsFor2017_Season() {
		
		/*given().
		 * when().
		 * then().
		 * assert()*/		
		
		given().
		when().
		get("http://ergast.com/api/f1/2017/circuits.json").
		then().
		assertThat().statusCode(200).and()
		.body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).and()
		.header("content-length", equalTo("4551"));
	
	}
	
	@Test(enabled=false)
	void Test_01() {
		
		Response response = get("http://ergast.com/api/f1/2017/circuits.json");
		
		System.out.println(response.asString());
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
										
			
	}
	
	@Test(enabled=true)
	void Test_02_GET() {
		
		given().
			get("http://ergast.com/api/f1/2017/circuits.json").
		then().
			statusCode(200).
			body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).
		and().
			body("MRData.CircuitTable.Circuits.circuitName", hasItem("Albert Park Grand Prix Circuit"));
			
	}
	
	@Test(enabled=true)
	void Test_03_POST() {
		
		
		
		
		
		
	}
	
	
	

}
