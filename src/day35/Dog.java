package day35;

public class Dog {
	public String name;
	public String ownerName;
	
	public Dog(String name, String ownerName) {
		System.out.println("Inside constructor");
		this.name = name;
		this.ownerName = ownerName;
	}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public Dog() {
		this("Sharik", "John"); 
		System.out.println("Inside empty constructor");
	}

}
