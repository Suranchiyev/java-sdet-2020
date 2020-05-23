package day27;

import java.util.HashSet;
import java.util.Set;

public class PersonDemo {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("John");
		
		Person p1 = new Person();
		p1.setName("John");
		
		System.out.println(p == p1);
		System.out.println(p.equals(p1));
		
		Set<Person> set = new HashSet<>();
		set.add(p);
		set.add(p1);
		System.out.println(set);
		
		// Object:
		// equals
		// hashCode
	}
}
