package day30;

import java.util.HashMap;
import java.util.Map;

public class MapWithCustomObj {
	public static void main(String[] args) {
		// Map<K, V>
		Map<Integer, Student> students = new HashMap<>();
		
		Student s1 = new Student("Kuba", 98.0, "Java");
		System.out.println(s1);
		
		students.put(1, s1);
		
		students.put(2, new Student("John", 50.0, "Java"));
		students.put(3, new Student("Vijay", 100.0, "Java"));
		
		System.out.println(students);
	}
}
