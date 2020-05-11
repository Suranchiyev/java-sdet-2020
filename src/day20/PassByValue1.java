package day20;

import java.util.Arrays;

public class PassByValue1 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int[] arr1 = arr;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		arr[0] = 300;
		arr1[1] = 200;
		
		System.out.println(Arrays.toString(arr));  // [300, 200, 3]
		System.out.println(Arrays.toString(arr1)); // [300, 200, 3]
	}
}
