package day5;

public class IncrementDecrement {
	public static void main(String[] args) {
		int number = 5;
		System.out.println("Example 1: " + number); // 5

		number = number + 1;
		System.out.println("Example 2: " + number); // 6

//      post increment - post increment will increament value by one in the next statment 
		number++; // number = number + 1;
		System.out.println("Example 3: " + number); // 7

		System.out.println("Example 4: " + number++); // 7
		System.out.println("Example 5: " + number); // 8

//      pre increment - pre incremtn will increase value by one in the same statment
		System.out.println("Example 6: " + ++number); // 9

		int num = 1;
		//         1    + 2
		int res = num++ + 2;
		System.out.println("Example 7: " + res); // 3
		System.out.println("Example 8: " + num); // 2

//             (1+2) + 5
		res = ++num + 5;
		System.out.println("Example 9: " + ++res); // 9

		int number2 = 100;
		number2 = number2 - 1; // 99
		number2--; // number2 = number2 - 1; 98
		--number2; // number2 = number2 - 1; 98 - 1 = 97
		System.out.println(number2--); // 97
		System.out.println(++number2); // 97 - 1 + 1

	}
}