package day4;

public class Student {

	
	public static void main(String[] args) {
		String name = "John Doe";
		double grade = 70.5;

		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);

		double percentToAdd = grade * 8.0 / 100;
		grade = grade + percentToAdd;

		System.out.println("Studnet name is " + name);
		System.out.println("Student grade is " + grade);
	}
}
