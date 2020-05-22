package day26;

public class PersonDemo {
	public static void main(String[] args) {
		Person person = new Person();
		//person.name = "John Doe";
		//person.age = -3;
		
		person.setName("John Doe");
		person.setAge(3);
		
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		
		Person person1 = new Person();
		person1.setName("Smith");
		person1.setAge(15);
	    System.out.println("Name: " +person1.getName());
	    System.out.println("Age: " +person1.getAge());
		
	}
}
