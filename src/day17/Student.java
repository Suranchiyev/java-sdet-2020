package day17;

public class Student {
	public String name;
	public int age;
	
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Akylbek";
		s.age = 31;
		
		Student s1 = new Student();
		s1.name = "Mark";
		s1.age = 27;
		
		s = s1;
		Student  s2 = s1;
		System.out.println(s2.name); // Mark 3, Akylbek 1
		
		// when == operator is used with references it will return true if they refer two the same object
		
		System.out.println(s == s1); // true
		
		Student s3 = new Student();
		
		System.out.println(s3 == s); // false
	}
}
