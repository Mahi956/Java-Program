
public class Employee {
	
	String employeename;
	String employeeaddress;
	
	public Employee()
	{
		employeename = "abc";
		employeeaddress = "jbp";
	}
	 public Employee(String n,String a)
	 {
	  employeename=n;
	  employeeaddress=a;
	 }
	
	public void getDetails()
	{
		System.out.println("Name of employee:"+ employeename);
		System.out.println("ddress of employee:"+ employeeaddress);
	}
	public static void main(String args[]) {
		Employee obj= new Employee();
		
		//Class name obj = new constructor()
		 obj.getDetails();
		 
		 Employee e1 =new Employee();
		 e1.employeename="a1";
		  e1.employeeaddress="bhopal"; 
		  e1.getDetails();
		  
		  Employee e2 = new Employee();
		  e2.employeename="a2";
		  e2.employeeaddress="indore";
		  e2.getDetails();
		  
		  Employee e3 = new Employee("sameer","jabalpur");
		  e3.getDetails();
		  
	}
}
