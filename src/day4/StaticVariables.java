package day4;

public class StaticVariables {
	public static String name = "John Doe";
	public static int age = 35;
	public static String city = "Arlington";

	public static void main(String[] args) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("City: " + city);
		System.out.println("------------------");

		name = "Smith";
		age = 47;
		city = "Chantilly";
		

	    System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("City: " + city);
		System.out.println("------------------");

//      local variables
		String name = "Alex";
		System.out.println(name);
		System.out.println("------------------");

		System.out.println(StaticVariables.name); // Smith
		System.out.println(name);                 // Alex
	}

}