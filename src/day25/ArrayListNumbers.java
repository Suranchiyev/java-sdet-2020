package day25;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(88);
		numbers.add(3);
		numbers.add(44);
		
		// Arrays.sort(array); Arrays class is helper class for all arrays []
		
		System.out.println(numbers);
		
		Collections.sort(numbers); // Collections class is helper class for collections (ArrayList)
		
		System.out.println(numbers);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(5);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(3);
		list1.add(7);
		
		System.out.println("Using equals method: " + list.equals(list1));
		
		if(list.size() == list1.size()) {
			boolean isEqual = true;
			for(int i = 0; i < list1.size(); i++) {
				//          2               2
				if(list.get(i) != list1.get(i)) {
					System.out.println("Not equal");
					isEqual = false;
				}
				
			}
			
			if(isEqual) {
				System.out.println("Equal");
			}
			
		}else {
			System.out.println("Not equal");
		}
	}
}
