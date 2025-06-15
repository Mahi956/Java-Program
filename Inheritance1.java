/* java does not support multiple inheritance it supports multilevel */
class EmpInfo{
	String Name ;
	String Age;
	
	public void getDetails() {
		System.out.println(Name);
		System.out.println(Age);
	}
	
} 
class Manager extends EmpInfo{
	String department;
	
	public void display() {
		super.Name="Mahi";
		super.Age="18";
		this.department="HR";
		super.getDetails();
		System.out.println(department);
	}
	
}


public class Inheritance1 {

	public static void main(String[] args) {
		Manager obj= new Manager();
		//EmpInfo obj1= new EmpInfo();
		
		obj.display();
	

	}

}
