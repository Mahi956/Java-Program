
interface utility1{
	static void printMessage(){
		System.out.println("Static method in inheritance");
	}
}

class Car1 implements utility{
	static void printMessage() {
		 System.out.println("car method in interface");
  }
}

public class Int_3 {

	public static void main(String[] args) {
		utility.printMessage();
		Car1.printMessage();

	}

}
