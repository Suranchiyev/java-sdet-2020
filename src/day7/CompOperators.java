package day7;

public class CompOperators {
	public static void main(String[] args) {
		bigNum(100);
		// 100 is regular number

		bigNum(2000);
		// 2000 is big number

		bigNum(1000);

		badNumber(13);

		badNumber(7);

		int res = min(99, 78);
		System.out.println(res); // 78

		res = min(1, 4);
		System.out.println(res); // 1

	}

	public static int min(int numOne, int numTwo) {

		if (numOne > numTwo) {

			return numTwo;
		} else {

			return numOne;
		}
	}

	public static void bigNum(int number) {
		// ==
		if(number >= 1000){
			System.out.println(number + " is big number");
		} else {
			System.out.println(number + " is regular number");
		}
	}

	public static void badNumber(int number) {
		if(number == 13) {
			System.out.println("Bad number is provided.");
		} else {
			System.out.println(number + " is good number.");
		}
	}
}