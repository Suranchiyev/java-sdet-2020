package day28;

public class Phone {
	public String model;
	public double price;
	
	
	// When class does not have any constructors, 
	//java will provide default empty constructor.
	
	public Phone(String model, double price) {
		this.model = model; 
		this.price = price;
	}
	
	public Phone(String model) {
		System.out.println("Here");
		this.model = model;
	}
	
	public Phone(double price) {
		this.price = price;
	}
	
	public Phone() {
		
	}
}
