package day6;

public class Person {

    public static void main(String[] args) {
		String name = "John Doe";
		int age = 9;

		displayDetails(name, age);

		//age = age + 10;
		age += 10;

		displayDetails(name, age);

		//age = age + 1;
        age++;

        displayDetails(name, age);
	}

	public static void displayDetails(String name, int age) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("--------------");
	}
}
