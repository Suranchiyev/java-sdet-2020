package day9;

public class Car {
	// public - can be used from any class
	// private - can be used only inside same class
	// protected - can be used in the same package or in subclasses
	// default access - can be used only in the same package
	
	public String model;
	int year;
	protected double price;
	private String color;
	String name;
	
	public void drive() {
		color = "black";
	}
	
	private void stop() {
		System.out.println("Stop!");
	}
	
	protected void turnLeft() {
		System.out.println("Turning left");
	}
	
	void reverse() {
		System.out.println("Reversing..");
	}
}
