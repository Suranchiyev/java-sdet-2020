package day27;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		// List<Integer> nums = new ArrayList<>();
		
		// [4][5][6]
		// no duplicates
		// set does not have get(index)
		// HashSet does not follow the order of insertion
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(4);
		numbers.add(-9);
		
		System.out.println(numbers);
		
		System.out.println("Size: " + numbers.size());
		
		for(Integer num : numbers) {
			System.out.println(num);
		}
		
		
		Set<String> names = new HashSet<>();
		names.add("John");
		names.add("Alex");
		names.add("John");
		System.out.println(names);
		
		names.remove("John");
		
		System.out.println(names);
	}
}
