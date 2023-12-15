package demoPackage;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Header {
@Test
public void m()
{
	RestAssured.given()
	.log().all()
	.header("h","jjj")// single header 
	.contentType("application/json")
	.when().get();	
}




@Test
public void m1()
{
	Map<String, String> h=new HashMap<String, String>();
	RestAssured.given()
	.log().all()
	
	.contentType("application/json")
	.when().get();	
}
}

