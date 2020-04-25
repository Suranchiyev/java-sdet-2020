package day5;

public class ConvertStringToPrimitives {
	public static void main(String[] args) {
		String numStr = "99";
		//        convert String number to int
		int num = Integer.parseInt(numStr);
		System.out.println(num + 10); // 109


		String numStr2 = "10.99";
		double dNumber = Double.parseDouble(numStr2);
		System.out.println(dNumber + 0.01); // 11.0

		int num2 = Integer.parseInt("77");
		System.out.println(num2);

		String bStr = "false";
		boolean b = Boolean.parseBoolean(bStr);
		System.out.println(b);
	}
}