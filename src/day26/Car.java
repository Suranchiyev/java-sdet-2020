package day26;

public class Car {
	public String model;
	public String color;
	public double price;
	
	// Blueprint for the objects. We create object/instance from a class. 
	public Car() {
		
	}
	
	public Car(String model) {
		// this -> it means this object
		this.model = model;
	}
	
	public Car(String model, String color, double price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}

}
