package day27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(2);
		numList.add(1);
		numList.add(20);
		numList.add(1);
		numList.add(12);
		numList.add(12);
		numList.add(50);
		System.out.println(numList);
		
		
		Set<Integer> numSet = new HashSet<>();
		
		for(Integer num : numList) {
			// 2, 1
			numSet.add(num);
		}
		
		System.out.println("HashSet: " + numSet);
		
		System.out.println("----------");
		// LinkedHashSet keeps insertion order
		Set<Integer> numSet2 = new LinkedHashSet<>(numList);
		System.out.println("LinkedHashSet: "+numSet2);
		
		
		System.out.println("----------");
		// TreeSet is sorted
		Set<Integer> numSet3 = new TreeSet<>(numList);
		System.out.println("Tree Set: " + numSet3);
	}
}
