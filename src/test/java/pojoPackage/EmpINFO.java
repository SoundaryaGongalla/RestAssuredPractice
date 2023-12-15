package pojoPackage;
/*
 * nested object
 * {"id":1,
 * "name":"see",
 * "Adress":{"ardress1":"kphb",
 * 			 "ardress2":"jntu"
 * 			}
 * }
 */
public class EmpINFO {

	private int empid;
	private String name;
	private int age;
	private EmpAdress eadress;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public EmpAdress getEadress() {
		return eadress;
	}
	public void setEadress(EmpAdress eadress) {
		this.eadress = eadress;
	}
	
	
	
}
