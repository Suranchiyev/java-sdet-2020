package day5;

public class SpecAssignmentOperators {
	public static void main(String[] args) {
		int num = 70;
		num = num + 10; // 80
		num += 10; // 90

		System.out.println(num);

		num = num - 10; // 80
		num -= 10;      //   70
		System.out.println(num); // 70

		num = num * 2;
		num *= 2;


		int num2 = 1;
		System.out.println(num2 + 1); // 2
		System.out.println(num2); // 1
		num2 += 5;
		// num2 = num2 + 5;
		System.out.println(num2); // 6

		num2 /= 2;
		// num2 = num2 / 2;
	}
}