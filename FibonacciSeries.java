
public class FibonacciSeries {

	public static void main(String[] args) {
		int n, a=0 , b=1, c;
		
		System.out.print("FibonacciSeries:");
		n=8;
		System.out.print(a + " " + b);
		for(int i=1;i<=n-1;i++) {
			c=a+b;
			System.out.print(" " + c);
			a=b;
			b=c;
		}

	}

}
