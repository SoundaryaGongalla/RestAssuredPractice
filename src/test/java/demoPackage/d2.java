package demoPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
//url content uri,param  given mean precondition
public class d2 {
//@Test
public void get()
{
	//given section
	// given means to send the request we use given
	RequestSpecification request=RestAssured.given();
	request.contentType("application/json");
	request.basePath("https://reqres.in/api/users/2");
	// when section
	//response means to get the response we use  when
	Response rp=request.when().get();
	// validation section

	//validation  then means to validate
	ValidatableResponse vr=rp.then();
	vr.log().body();
	//validate 
	vr.log().all();
	vr.log().cookies();
	
	
}

@Test
public void getdata()
{
	RestAssured.given()
	.baseUri("https://reqres.in/api/users?page=2")
	.when().get()
	.then()
	.log().all();
	
	
	
	
}
/**
 * this method is used to post the data /create a user in server
 */
@Test
public void postdata()
{
RestAssured.given()
.contentType("application/json")
	.body(" {\r\n"
			+ "            \"id\": 888,\r\n"
			+ "            \"email\": \"lindsay.ferguson@reqres.in\",\r\n"
			+ "            \"first_name\": \"Lindsay\",\r\n"
			+ "            \"last_name\": \"Ferguson\",\r\n"
			+ "            \"avatar\": \"https://reqres.in/img/faces/8-image.jpg\"\r\n"
			+ "        }")
	.baseUri("https://reqres.in/api/")
	.basePath("users")
	.when().post()
	.then()
	.statusCode(201)
	.log().all();
}
// pathparm/uriparm

@Test
public void getdatausingparm()
{
	RestAssured.given()
	.pathParam("id", 2)
	.baseUri("https://reqres.in/api/users?page=")
	.basePath("{id}")
	.when().get()
	.then()
	.log().all();


}

@Test
public void getdatafrompramuri()
{
	
	RestAssured.given()
	.when().get("https://reqres.in/api/users?page=2")
	.then()
	.log().all();
}

//IlegalArgumentException:when i was passing wrong parmater

//url parameterisation

@Test
public void getdatafromuriparameteisation()
{
	
	RestAssured.given()
	.when().get("https://reqres.in/api/users?{us}{id}","page=",45)
	.then()
	.log().all();
}

@Test
public void deldata()
{
	RestAssured.given()
	.when().delete("https://reqres.in/api/users/2")
	.then().log().all();
}














}