package day20;

import java.util.Arrays;

public class Assignment {
	public static void main(String[] args) {
		int[] num = {1, 6, 7, 99, 100, -10, 3, 5};
		System.out.println(getMaxValue(num)); // 100
		
		System.out.println(getMinValue(num)); // -10
		
		char[] chArr = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(Arrays.toString(chArr)); // [a, b, c, d, e]
		
		swapFirstLast(chArr);
		
		System.out.println(Arrays.toString(chArr)); // [e, b, c, d, a]
	}
	
	public static void swapFirstLast(char[] charArr) {
		char tmpVar = charArr[0];
		charArr[0] = charArr[charArr.length - 1];
		charArr[charArr.length - 1] = tmpVar;
	}
	
	public static int getMaxValue(int[] numbers) {
		int max = numbers[0];
		for(int number : numbers) {
			if(number > max) {
				max = number;
			}
		} 
		
		return max;
	}
	
	public static int getMinValue(int[] numbers) {
		int min = numbers[0];
		for(int number : numbers) {
			if(number < min) {
				min = number;
			}
		}
		
		return min;
	}
	

}
