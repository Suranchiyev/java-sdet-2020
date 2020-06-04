package day33;

public class PersonDemo3 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.printDetails(); // null null 0
		System.out.println("-------");  
		
		p1.firstName = "Alex";
		p1.lastName = "Rodriguez";
		// Person.age = 40;
		p1.age = 40;
		
		Person p2 = new Person();
		p2.printDetails(); // null null 40
		System.out.println("-------");
		
		p2.firstName = "Ramesh";
		p2.lastName = "Kanery";
		p2.age = 45;
		
		p2.printDetails(); // Ramesh Kanery 45
		System.out.println("-------");
		
		Person p3 = new Person();
		p3.printDetails(); // null null 45
		System.out.println("-------");
	}
}
