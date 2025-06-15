import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.Pattern;

public class App28 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Mobile No.-");
		String mobile =sc.nextLine();
		
		Pattern p =Pattern.compile("[0-9]{10}");
		
		Matcher m= p.matcher(mobile);
		if(m.matches()) {
			System.out.println("valid no.");
		}
		else
		{
			System.out.println("Invalid no.");
		}
	}

}
