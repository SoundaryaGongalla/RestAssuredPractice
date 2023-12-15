package pojoMainPackage;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojoPackage.MultipleObject;

public class MultipleObjectMainClass {
@Test
public void m()
{
	MultipleObject mo1=new MultipleObject();
	mo1.setId(1);
	mo1.setAge(21);
	mo1.setName("soundarya");
	
	MultipleObject mo2=new MultipleObject();
	mo2.setAge(22);
	mo2.setId(2);
	mo2.setName("soundarya2");
	
	List<Object>l=new ArrayList<Object>();
	l.add(mo1);
	l.add(mo2);
	
	RestAssured.given().log().all().body(l).when().get();
	
	
	
}
}
