
public class ExeH1 {

	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println("a= " +a );
			int b=10/a;
			int c[]= {5};
			
		}
		catch(ArithmeticException e){
			System.out.println("Divided by Zero" );
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound");
		}
		
	}

}
