package day4;

public class ArithmeticOperators1 {
	public static void main(String args[]) {
		// %
		int num = 10;
		int num1 = 3;
		System.out.println(num / num1); // 3 and remainder 1

		System.out.println("Getting remainder:");
		System.out.println(num % num1); // 1

		// 12 / 10 = 1 and remainder 2
		// 12 % 10 = 2

		// 22 / 10 = 2 and remainder 2
		// 22 % 10 = 2 

		// 17 / 5 = 3 and remainder 2
		// 17 % 5 = 3 and remainder 2

		// 23 / 5 = 4 and remainder 3
		// 23 % 5 = 3

		// 117 / 100 = 1 and remainder 17
		// 117 % 100 = 17

		// 234 / 100 = 2 and remainder 34
		// 234 % 100 = 34
		System.out.println("--------------");

		System.out.println(45 % 5); // 0
		System.out.println(47 % 5); // 2
        System.out.println(47 % 20); // 7
        System.out.println(1001 % 1000); // 1
        System.out.println(12 % 9); // 3
	}
}