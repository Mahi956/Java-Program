
public class primeNo {

	public static void main(String[] args) {
		int n,t=1;
//		System.out.println("Enter a No:");
		
		n=1;
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
