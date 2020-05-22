package day26;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmpUp {
	public static void main(String[] args) {
		String[] strArr = {"apple", "banana", "orange", "kiwi"};
		System.out.println(Arrays.toString(strArr));
		
		reverse(strArr); 
		System.out.println(Arrays.toString(strArr)); // [kiwi, orange, banana, apple]
		System.out.println("---------");
		
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("kiwi");
		list.add("pineapple");
		System.out.println(list);
		
		reverse(list);
		System.out.println(list); // [pineapple, kiwi, orange, banana, apple]
	}
	
	public static void reverse(ArrayList<String> list) {
		// get(index) - to get element
		// set(index, element) - to change value of element
		
		//    0         1       2      3       4
		// [pineapple, kiwi, orange, banana, apple]
		// size: 5         2 <  2
		for(int i = 0; i < list.size() / 2; i++) {
			//     banana            1
			String tmpVar = list.get(i);
			//       1,         kiwi      3     
			list.set(i, list.get(list.size() - 1 - i));
			//           3,        banana
			list.set(list.size() - 1 - i, tmpVar);
		}
		
	}
	
	public static void reverse(String[] arr) {
		//    0      1       2       3
		// [apple, banana, orange, kiwi]
		for(int i = 0; i < arr.length / 2; i++) {
			String tmpVar = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmpVar;
		}
	}
}
