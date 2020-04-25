package day4;

public class Person {
	
	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";
		int age = 45;

		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);

//       55 =  45 + 10
		age = age + 10;

		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);

  // ---------------------------------------------
		System.out.println("Age: " + (age + 10)); // 65
		System.out.println("Age: " + age);        // 55


  // ---------------------------------------------
		System.out.println("Age: " + age + 10);  // 5510
		System.out.println("Age: " + (age = age + 10)); // 65
		System.out.println("Age: " + age);              // 65

  // ---------------------------------------------
		System.out.println(age + 10 + " is " + firstName + "'s age now");
		// 75 is John's age now
	}
}