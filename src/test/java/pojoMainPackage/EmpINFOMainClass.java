package pojoMainPackage;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojoPackage.EmpAdress;
import pojoPackage.EmpINFO;

public class EmpINFOMainClass {
@Test
public void empdetails()
{
	EmpINFO e=new EmpINFO();
	e.setAge(6);
	e.setEmpid(1);
	e.setName("house");
	
	
	
//	
	EmpAdress eadress=new EmpAdress();
	eadress.setAdress1("KPHB");
	eadress.setAdress2("jntu");
	eadress.setAdress3("dd");
//	
	
e.setEadress(eadress);
	
	RestAssured.given().log().all().body(e).when().get();
}
	
}
