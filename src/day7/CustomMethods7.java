package day7;

public class CustomMethods7 {
	public static void main(String[] args) {
		String str = "Hello";
		exPrint(str);

		double numOne = 55.99;

		double numTwo = plus100(numOne);

		System.out.println(numTwo);
	}

	public static void exPrint(String word) {
		System.out.println(word + "!");
	}

	public static double plus100(double number){
		System.out.println("Hello world");
		return number + 100;
	}
}