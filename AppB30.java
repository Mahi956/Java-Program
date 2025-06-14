
public class AppB30 {

	public static void main(String[] args) {
		int i=0;
		String greetings[]= {"HEllo", "Hii","Byee"};
		
		try {
			while(i<= greetings.length) {
				System.out.println(greetings[i]);
				i++;
		}
		} 
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("All greetings are:");
	}

}
