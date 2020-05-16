package day22;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] num = {6, 3, 2, 10, 0, 7, 5, 10};
		// 1. The data for binary search should be sorted
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		int key = 2;
		int index = Arrays.binarySearch(num, key);
		
		System.out.println("Key: " + key);
		System.out.println("Index: " + index);
	}
}
