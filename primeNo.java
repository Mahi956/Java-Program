import java.util.*;
public class primeNo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a no: ");

		int n = scr.nextInt();
		int t=1;
		// n=1;
		for(int i =2; i<=n-1; i++) {
			t=n%i;
			if(t==0) {
				break;
			}
		}
		if (n==1) {
			System.out.println("1 is neither prime nor composit.");
		}else if(t!=0) {
			System.out.println(n +" is a prime No.");
		}else {
			System.out.println(n +" is not a prime No");
		}

	}

}
