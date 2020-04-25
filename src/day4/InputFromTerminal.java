package day4;

public class InputFromTerminal {
	public static void main(String[] args) {
		String name = args[0];
		String age  = args[1];
		String country = args[2];

		System.out.println("Hello, " + name + "!");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Country: " + country);
	}
}