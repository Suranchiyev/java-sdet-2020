package day32;

public class Student {
	public String name;
	public int age;
	
	public void code() {
		System.out.println(name + " is coding");
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "John";
		s1.code();
		
		Student s2 = new Student();
		
		// == to compare references if they are pointing to the same object
		s1 = s2;
		System.out.println(s1 == s2);
		
		
	}
}
