package day33;

public class PersonDemo2 {
	// what is a static keyword in Java?
	// - static variables and methods belong to class itself 
	//   and not to specific object
	// - static variables and methods are used by class name
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.firstName = "John";
		person1.lastName = "Doe";
		// person1.age = 40;
		Person.age = 40;
		person1.printDetails();
		System.out.println("---------");
		
		Person person2 = new Person();
		person2.printDetails();
		
		person2.age = 45;
		System.out.println(person2.age);
		
		System.out.println("person1 age: " + person1.age);
		
		System.out.println(Person.age);
		
		
		Person person3 = new Person();
		System.out.println("person3 age: " + person3.age);
		System.out.println(Person.age);
	}
	
	
}
