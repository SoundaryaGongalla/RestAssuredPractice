package pojoMainPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojoPackage.SingleObject;

public class SingleObjectMainClass {
@Test
public void m()
{
	SingleObject s=new SingleObject();
	s.setId(1);
	s.setName("Star");
	RestAssured.given().log().all().body(s).when().get();
}
}
