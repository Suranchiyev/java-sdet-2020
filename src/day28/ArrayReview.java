package day28;

import java.util.Arrays;

import day27.Book;

public class ArrayReview {
	public static void main(String[] args) {
		//                     size
		int[] numbers = new int[5];
		
		// [0][0][0][0][0]
		//  0  1  2  3  4
		
		System.out.println(Arrays.toString(numbers));
		
		numbers[0] = 1;
		
		int len = numbers.length;
		numbers[len - 1] = 99;
		System.out.println(Arrays.toString(numbers));
		
		int num = numbers[2];
		
		
		String[] names = {"John", "Alex"};
		
		Book[] books = new Book[3];
		
		// [null][null][null]
		// [Book][Book][Book]
		
		books[0] = new Book();
		books[0].setAuthor("Covy");
		
		// Array is pass by reference
		makeAll100(numbers);
		System.out.println(Arrays.toString(numbers));
		
		// Arrays class is helper class for Array
		Arrays.sort(numbers);
	}
	
	public static void makeAll100(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 100;
		}
	}
}
