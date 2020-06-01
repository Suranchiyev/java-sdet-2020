package day32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsReview {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(3);
		nums.add(7);
		nums.add(1);
		nums.add(0);
		nums.add(-4);
		nums.add(53);
		nums.add(53);
		
		System.out.println(nums);
		
		System.out.println(nums.get(0));
		
		System.out.println("Size: " + nums.size());
		System.out.println(nums.get(nums.size() - 1));
		
		for(int i = nums.size() - 1; i >= 0; i--) {
			System.out.print(nums.get(i) + " ");
		}
		System.out.println("\n");
		
		
		// How do I sort my List ?
		// Collections class is helper class for collections (List)
		Collections.sort(nums);
		
		List<List<Integer>> twoDimList = new ArrayList<>();
		
		List<Integer> fL = new ArrayList<>();
		fL.add(5);
		fL.add(6);
		
		twoDimList.add(fL);
		
		
		System.out.println(twoDimList.get(0).get(1));
		// [[[5][6]] ]
		
		
		System.out.println("-------------");
		
		
		// Set does not allow duplicates 
		Set<String> names = new HashSet<>();
		names.add("John");
		names.add("John");
		names.add("john");
		System.out.println(names);
		
		
		System.out.println("-----------");
		// Map<K, V>
		// Key value data structure 
		// Keys are unique
		Map<Integer, String> items = new HashMap<>();
		
		// put(K, V);
		items.put(0, "banana");
		items.put(1, "orange");
		items.put(2, "apple");
		items.put(3, "kiwi");
		
		System.out.println(items.get(3));
		
		items.put(2, "watermelon");
		System.out.println(items);
		
		Set<Integer> keys = items.keySet();
		System.out.println(keys);
		
		for(Integer key : keys) {
			System.out.println(key + " : " + items.get(key));
		}
		
		System.out.println("Size of map: " + items.size());
 	} 
}
