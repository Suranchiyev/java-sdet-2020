package day42;

import java.util.Arrays;

public class Methods {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		new Methods().reverseArr(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public int sum(int num, int num2) {
		return num + num2;
	}
	
	public boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public boolean isOdd(int num) {
		if(num < 0) {
			//return false;
			throw new IllegalArgumentException("Only positive numbers");
		}
		return num % 2 == 1;
	}
	
	public String reverse(String str) {
		String rev = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}
	
	// reverse the array
	// if array is empty throw IllegalArgumentException
	public void reverseArr(int[] arrNum) {
		if(arrNum.length == 0) {
			throw new IllegalArgumentException("Empty Array");
		}
		
		int j = arrNum.length - 1;
		for(int i = 0; i < arrNum.length / 2; i++) {
			int tmp = arrNum[i];
			arrNum[i] = arrNum[j - i];
			arrNum[j - i] = tmp;
		}
	}
}
