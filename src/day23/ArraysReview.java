package day23;

import java.util.Arrays;

public class ArraysReview {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		//  0 1 2 3 4
		// [][][][][]
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		System.out.println("Length: " + numbers.length);
		
		// int 
		numbers[0] = 9;
		numbers[1] = 8;
		
		// 
		String[] names = {"Smith", "John"};
		System.out.println(names[0]);
		System.out.println(names.length);
		
		String str =  Arrays.toString(names);
		System.out.println(str);
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("--------------");
		
		
		String str1 = "hello";
		System.out.println(str1); // hello
		changeStr(str1);
		System.out.println(str1); // apple
		
		String[] arrNames = {"john", "smith"};
		System.out.println(Arrays.toString(arrNames));
		
		changeArr(arrNames);
		
		System.out.println(Arrays.toString(arrNames));
		System.out.println(Arrays.toString(arrNames));
	}
	
	public static void changeStr(String str) {
		// str = str1;
		str = "apple";
	}
	
	public static void changeArr(String[] arr) {
		// arr = arrNames;
		arr[0] = "apple";
		arr[1] = "orange";
	}
}
