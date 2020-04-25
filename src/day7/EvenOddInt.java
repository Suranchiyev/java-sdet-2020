package day7;

public class EvenOddInt {
	public static void main(String[] args) {
		// even: 2, 4, 6, 10, 100, 200
		// odd: 1, 3, 7, 9, 13

		int number = Integer.parseInt(args[0]);

		// if we use mod opertor by 2 to the number and output is 0 then number is even
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		}else {
			System.out.println(number + " is odd");
		}

		// <number> is even
	}
}