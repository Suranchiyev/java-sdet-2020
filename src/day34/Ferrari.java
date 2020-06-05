package day34;

public class Ferrari extends Car {
	public String model;
	
	public Ferrari(String model) {
		this();
	}
	
	public Ferrari() {
		super("Some model");
	}
	
	
	@Override
	public void drive() {
		System.out.println("Ferrari("+ model +") is driving");
	}
	
	public void test() {
		System.out.println(model);
		System.out.println(super.model);
		
		drive();		
		super.drive();
		
//		super.model = "dfsd";
//		super.price = 342.34;
	}
	
	// visibility - access modifiers
	// public - visible everywhere 
	// protected - visible in same package and in child classes
	// default - visible only in the same package
	// private - visible only inside the class
	
	// BREAK 10 min. Till 8:15 PM
	
}
