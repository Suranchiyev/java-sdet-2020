package day33;

public class PersonDemo {
	public static void main(String[] args) {
		Person john = new Person();
		//System.out.println(john);	
		john.firstName = "John";
		john.lastName = "Doe";
		
		String fullName = john.getFullName();
		//System.out.println(fullName);
		john.printDetails();
		
		System.out.println("--------");
		
		Person obj = new Person();
		obj.printDetails();
		
		System.out.println("--------");
		
		//john = obj;
		obj = john;
		john.printDetails();
		
		obj.firstName = "Bob";
		
		System.out.println("--------");
		john.printDetails();
		

		
		
		
	}
}
