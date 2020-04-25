package day6;

public class MethodExample6 {
	public static void main(String[] args) {
		int myNumber = 23;

		myNumber = negativeFive(myNumber);

		System.out.println(myNumber);  // 18


		int numberOne = 2;
		int numberTwo = 4;
		int output = plusMethod(numberOne, numberTwo);
		System.out.println(output);

		System.out.println(plusMethod(5,5));

		printConcat("Java", "Cool");
	}

	public static int negativeFive(int num) {
		int number = num - 5;
		return number;
	}

	public static int plusMethod(int numOne, int numTwo) {
		return numOne + numTwo;
	}

	public static void printConcat(String wordOne, String wordTwo) {
		System.out.println(wordOne + " " + wordTwo);
	}
}