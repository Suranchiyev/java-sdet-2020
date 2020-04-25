package day3;

public class FloatingNumber {
	public static void main(String args[]) {
		float num = 4.5F;
		float num2 = 6.132423F;
		float num3 = 9.99F;

		double d = 14223.99;

		d = d * 4;
		System.out.println(d);

		double d1 = 1.5;
		String res = "Value is " + d1;
		System.out.println(res);

		double d2 = 5.3;
		//String res1 = "Result " + (d2 + 4);
		//            "Result 9.3"
		String res1 = "Result " + (d2 + 4);

		System.out.println(res1); // 9.3
	}
}