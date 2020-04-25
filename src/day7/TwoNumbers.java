package day7;

public class TwoNumbers {
	public static void main(String[] args) {
		int numberOne = Integer.parseInt(args[0]);
		int numberTwo = Integer.parseInt(args[1]);

		if( numberOne == numberTwo) {
			System.out.println(numberOne + " and " + numberTwo + " are equal");
		} else {
			System.out.println(numberOne + " and " + numberTwo + " are not equal");
		}
	}
}