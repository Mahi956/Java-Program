
//SUPER CLASS
class Animal{
	void eat() {
		System.out.println("Cow is eating grass");
	}
}

// SUB-CLASS
class Cow extends Animal{
	void relax() {
		System.out.println("cow is sleeping");
	}
}

public class InheritanceSINGLE {

	public static void main(String[] args) {
		Cow c1= new Cow();
		c1.eat();
		c1.relax();
	}

}
