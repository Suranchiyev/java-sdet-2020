package day22;

public class CustomObjects {
	public static void main(String[] args) {
		Student[] javaClass = new Student[4];
		
		Student s1 = new Student(1, "John");
		javaClass[0] = s1;
		
		Student s2 = new Student(2, "Smith");		
		javaClass[1] = s2;
		
		javaClass[2] = new Student(3, "Alex");
		javaClass[3] = new Student(4, "Kuba");
		
		for(Student student : javaClass) {
			System.out.println(student.name + ", id: " + student.id);
		}
		
		
	}
}

class Student{
	long id;
	String name;
	
	public Student(long idFromUser, String nameFromUser) {
		id = idFromUser;
		name = nameFromUser;
	}
}
