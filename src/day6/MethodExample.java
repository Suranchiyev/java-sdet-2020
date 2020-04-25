package day6;

public class MethodExample {

	public static void main(String[] args) {
		printHello();

		printHello();

		saySomething();

		justAMethod();

	}

	public static void printHello() {
		String word = "Hello";
		System.out.println(word);
		System.out.println(word);
	}

	public static void saySomething() {
		System.out.println("Something");
	}

	public static void justAMethod() {
		String str = "apple";
	}
}
