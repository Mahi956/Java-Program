interface vehicle{
	void start();
	
	default void fuelType() {
		System.out.println("Default fuel type: Prtrol/Diesel");
	}
	
}

class Car implements vehicle{
	public void start() {
		System.out.println("car is starting");
	}
	
	public void fuleType() {
		System.out.println("Default fuel type:Petrol");
	}
}


public class Int_1{
	public static void main(String args[]) {
		Car mycar =new Car();
		mycar.start();
		mycar.fuelType();
	}
	
}