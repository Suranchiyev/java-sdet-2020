package day28;

import java.util.Arrays;


public class ArrayInterview {
	public static void main(String[] args) {
		// finding average value of array of int[]
		// finding sum of all elements
		// finding max and min
		// finding n max and n min
		// reverse array
		
		int[] numbers = {2, 3, 4, 1, 8, 6, 10, 9};
		System.out.println("Average: " + average(numbers));
		
		System.out.println("Max: " + max(numbers));
		
//		System.out.println("Max N: " + Arrays.toString(maxN(numbers, 2)));
//		
//		System.out.println("Min N: " + Arrays.toString(minN(numbers, 5)));
		
		// reverse(numbers);
		// System.out.println("Reverse: " + Arrays.toString(numbers));
		
		
		System.out.println("Reverse 2: " + Arrays.toString(reverseArr(numbers)));
	}
	
	public static int[] reverseArr(int[] numbers) {
		int[] revArr = new int[numbers.length];
		int j = 0;
		// 2, 3, 4, 1, 8, 6, 10, 9
		for(int i = numbers.length - 1; i >= 0; i--) {
			revArr[j] = numbers[i];
			j++;
		}		
		return revArr;		
	}
	
	public static void reverse(int[] numbers) {
		// [2, 3, 4, 1, 8, 6, 10, 9]
		for(int i = 0; i < numbers.length / 2; i++) {
			int tempVar = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = tempVar;
		}
	}
	
	public static int[] minN(int[] numbers, int n) {
		int[] minN = new int[n];
		
		for(int i = 0; i < n; i++) {
			int min = numbers[i];
			int indexMin = i;
			for(int j = i; j < numbers.length; j++) {
				if(min > numbers[j]) {
					min = numbers[j];
					indexMin = j;
				}
			}
			
			minN[i] = min;
			swap(numbers, i , indexMin);
		}
		return minN;
	}
	
	public static void swap(int[] nums, int i, int j) {
		int tmpVar = nums[i];
		nums[i] = nums[j];
		nums[j] = tmpVar;
	}
	
	public static int[] maxN(int[] numbers, int n) {
		// numbers = [1, 3, 5, 2, 7, 4]
		// n = 2
		// return [7, 5]
		int[] nArray = new int[n];
		Arrays.sort(numbers);
		
		int j = 0;
		for(int i = numbers.length - 1; i >= 0; i--) {
			if(j == nArray.length) {
				break;
			}
			
			nArray[j] = numbers[i];
			j++;
		}
		
		return nArray;
	}
	
	public static int max(int[] numbers) {
		// [1, 3, 5, 2, 7, 4]
		//   1
		int max = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			//  7 <    4
			if(max < numbers[i]) {
			//  7
				max = numbers[i];
			}
		}
		
		return max;
	}
	
	public static int average(int[] numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		
		return sum / numbers.length;
	}
}
