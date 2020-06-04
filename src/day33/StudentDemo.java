package day33;

public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.firstName = "Smith";
		student.lastName = "Doe";
		student.courseName = "Java";
		
		System.out.println(student.firstName);	
		student.printDetails();
	}
}
