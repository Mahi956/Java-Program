// 22nd MAY 2025

class Address {
	String city , state , zip;
	Address(String c, String s ,String z){
		this.city=c;
		this.state=s;
		this.zip=z;
	}
}

class EmployeeInfo{
	int id;
	String name;
	Address address ;// Employee class has a Address attribute

	EmployeeInfo(int id , String name, Address address ){
		this.id=id;
		this.name=name;
		this.address=address;
	}

public void getDetails() {
	System.out.println("id: "+ this.id +", NAME: "+ this.name + ", city: "+this.address.city +"state: "+ this.address.state + "Zip: "+ this.address.zip);
	}
}
public class Relation {

	public static void main(String[] args) {
		
		Address a1 = new Address("jbp ", "MP " ,"482001");  
		Address a2 = new Address(" bhopal ", "MP " ,"482002"); 
		Address a3 = new Address("indore ", "MP " ,"482003"); 
		
		EmployeeInfo e1 =new EmployeeInfo(1, "aa ", a1);
		EmployeeInfo e2 =new EmployeeInfo(2, "ab ", a2);
		EmployeeInfo e3 =new EmployeeInfo(3, "ac ", a1);
		EmployeeInfo e4 =new EmployeeInfo(4, "ad ", a3);
		
		e1.getDetails();
		e2.getDetails();
		e3.getDetails();
		e4.getDetails();
		
	}

}
