package folder;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostManColloection {

	@Test
	public void getData()
	{
		
		RequestSpecification req=RestAssured.given().contentType("application/json").baseUri("https://reqres.in/api/users?page=2");
		
		
		
		Response r=RestAssured.when().get();
	
	ValidatableResponse vv =r.then().log().all();
	}
	
	
}
