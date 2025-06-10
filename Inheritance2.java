class parent{
	void goHOme() {
		System.out.println(" By bus");
	}
	void properties() {
		System.out.println("cash+ gold + land");
	}
}

class child extends parent{
	void goHome() {
		System.out.println(" By bike");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		child c1 =new child();
		c1.goHome();
		c1.properties();

	}

}
