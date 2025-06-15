import java.util.*;
public class Input {

	public static void main(String[] args) {
		String s;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter name");
		String name =sc.nextLine();
		
		System.out.println("Enter Age");
		int age =sc.nextInt();
		
		System.out.println("Enter Salary");
		double sal = sc.nextDouble();
		
		System.out.println("Name:"+ name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+sal);
		
		/*Scanner Drawback ---> can not take input after taking integer input(any numeric input)
		 * 
		 *  SOLUTION ---->  after taking input nextLine()  function lelo string lene se pehle  */
	}

}
