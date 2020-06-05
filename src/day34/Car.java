package day34;

public class Car{
	public String model;
	public double price;
	
	protected void drive() {
		System.out.println("Car(" + model + ") is driving");
	}
	
	public Car(String model) {
		System.out.println("Inside parent const");
		this.model = model;
	}
	
	public Car() {
		
	}
}
