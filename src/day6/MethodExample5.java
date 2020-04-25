package day6;

public class MethodExample5 {

	public static void main(String[] args) {

		sayHelloTo("John Doe");

		sayHelloTo("Alex Rodriguez");

		sayHelloTo("Beknazar");

		sayHelloTo("Smith");
	}

	public static void sayHelloTo(String name) {
		System.out.println("Hello, " + name + "!");
	}

    // Hello, John Doe!
	// Hello, Alex Rodriguez!
	// Hello, Beknazar!
	// Hello, Smith
}
