package day20;

import java.util.Arrays;

public class PassByValue {
	public static void main(String[] args) {
		String[] arrStr = new String[] { "a", "b", "c" };

		String[] arrStr1 = arrStr;
		arrStr1[0] = "e";

		System.out.println(Arrays.toString(arrStr));
		System.out.println(Arrays.toString(arrStr1));

		int num = 10;
		changeVal(num);
		System.out.println(num);

		int[] numArr = { 1, 2, 3 };
		System.out.println("Initial arr: " + Arrays.toString(numArr));

		changeArrVal(numArr);
		System.out.println("After method: " + Arrays.toString(numArr));
	}

	public static void changeArrVal(int[] arr) {
		// arr = numArr
		arr[0] = 100;
	}

	public static void changeVal(int n) {
		// n = num;
		n = 5;
	}
}
