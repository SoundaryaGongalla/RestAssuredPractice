package folder;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class P1 {
@Test
public void getdataFromParam()
{
RequestSpecification req=RestAssured.given().contentType("application/json");
Response v = req.when().get("https://reqres.in/api/users?page=2");

int code=v.getStatusCode();
Assert.assertEquals(code, 23);
{
	
}
//System.out.println("code validated");


String line=v.getStatusLine();
System.out.println(line);

}
	
	
}
