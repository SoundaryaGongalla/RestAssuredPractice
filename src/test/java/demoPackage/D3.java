package demoPackage;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class D3 {
//VALIDATION
	
	@Test
	public void valid()
	{
		RestAssured.given()
	.when()
	.get("https://restful-booker.herokuapp.com/booking")
	.then()
	.statusCode(200)
	.time(Matchers.lessThan(6000l))
	.contentType("application/json")
	.log().all();
		
	}
	
	
	
	
	
	
}
