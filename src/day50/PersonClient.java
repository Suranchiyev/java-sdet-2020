package day50;
import java.util.*;

public class PersonClient {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("John");
		person.setAge(38);
		
		List<String> myKids = new ArrayList<>();
		myKids.add("Alex");
		myKids.add("Joseph");
		
		person.setKids(myKids);
		System.out.println(person);
		
		myKids.add("Kuba");
		System.out.println(person);
		
		Student student = new Student();
		student.setName("Smith");
		student.setAge(20);
			
		Student student1 = new Student();
		student1.setName("Smith");
		student1.setAge(20);
		
		// ==
		boolean isEqual = student.equals(student1);
		System.out.println(isEqual);
		
		

		Person obj = new Student();
		
		// Person -> Reference type
		// new Student() -> Actual object
				
		System.out.println(obj.getName());
		
		List<String> list = new ArrayList<>();
		List<String> list1 = new LinkedList<>();
		
		list.add("apple");
		
		
	}
}
