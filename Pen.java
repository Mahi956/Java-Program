
public class Pen {
	
	String Brand;
	String colour;
	
	Pen (String Brand,String colour){
		this.Brand= Brand; 
		this.colour = colour;
		
	}
	
	Pen setcolour (String colour) {
		this.colour = colour;
		return this;// Return the current object
	}
	

	Pen setBrand(String Brand) {
		this.Brand=Brand; 
		return this;// Return the current object
	}
	
	void display() {
		System.out.println("Brand:"+ this.Brand+  ",colour: "+ this.colour);
	}
	
	
	public static void main(String[] args) {
		Pen myPen= new Pen ("Parker","Blue");
		myPen.setBrand("Pilot").setcolour("Red").display();
	}

}
