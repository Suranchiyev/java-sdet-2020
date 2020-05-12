package day21;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num));
		// [6, 3, 2, 10, 0, 7, 5]
		
		
		selectionSort(num);
		// [0, 2, 3, 5, 6, 7, 10]
		System.out.println(Arrays.toString(num));
		
		// 1. find smallest value
		// 2. swap
	}
	
	public static void selectionSort(int[] num) {
		for(int i = 0; i < num.length; i++) {
			int smallestIndex = getSmallestIndex(i, num);
			swapElements(i, smallestIndex, num);
		}
	}
	
	public static int getSmallestIndex(int startIndex, int[] num) {
		int min = num[startIndex];
		int minIndex = startIndex;
		
		for(int i = startIndex + 1; i < num.length; i++) {
			if(min > num[i]) {
				min = num[i];
				minIndex = i;
			}
		}
		
		return minIndex;
	}
	
	public static void swapElements(int i, int j, int[] num) {
		int temp = num[i]; 
		num[i] = num[j];
		num[j] = temp;
	}
}
