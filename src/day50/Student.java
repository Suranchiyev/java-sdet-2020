package day50;

public class Student extends Person {
	// what do you know about Object class? 
	// Object class is parent of all the java classes
	
	
	public void code() {
		System.out.println("Coding");
	}
	
	@Override
	public String getName() {
		return "Student: ";
	}
}
