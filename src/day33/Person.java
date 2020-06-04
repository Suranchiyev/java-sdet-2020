package day33;

public class Person {
	public String firstName;
	public String lastName;
	public static int age;
	
	// what is a static keyword in Java?
	// - static variables and methods belong to class itself and not to specific object
	// - static variables and method are used by class name
	
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public void printDetails() {
		System.out.println("firstName: " + this.firstName);
		System.out.println("lastName: " + this.lastName);
		System.out.println("age: " + this.age);
		
	}
	
	
	public static void printHello(String name) {  
		// you cannot access non static variables and methods inside static method
		// System.out.println(lastName); 
		// printDetails();
		
		// printHello(obj.getFullName());
		
	}
	
	// static method should be used by class name
	// Most of the time they are helper methods
	// static methods will not involve the object properties
	
}