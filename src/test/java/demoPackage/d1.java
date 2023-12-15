package demoPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class d1 {
@Test
public void d()
{// I								class
	RequestSpecification request=RestAssured.given();
	request.contentType("application/json");
	request.basePath("http://localhost:3000/posts");
	
	Response  rp=request.when().get();
	rp.then().log().all();
	
}
	
}

