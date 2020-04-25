package day4;

public class ArithmeticOperators {
	public static void main(String[] args) {
			// + - * /
		    // % mod/remainder
		int num = 7;
		int num2 = 2;

		// 7 / 2 = 3 -> because int can hold only whole numbers
		System.out.println(num / num2); // 3

        // even you store value into double output is 3. Because both num and num2 are int (whole numbers) 
		double res = num / num2;
		System.out.println(res); // 3

		double d1 = 7.0;
		double d2 = 2.0;
		System.out.println("d1 / d2 : "+d1 / d2);

		int i = 7;
		double d3 = i;
		System.out.println("d3 : "+d3);
	}
}
