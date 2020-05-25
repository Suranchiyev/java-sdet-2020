package day28;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetReview {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("John");
		names.add("Smith");
		names.add("Vijay");
		names.add("Ramesh");
		names.add("John");
		
		// does not follow the insertion order
		System.out.println(names);
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("--------");
		
		// LinkedHashSet
		Set<String> names2= new LinkedHashSet<>();
		names2.add("John");
		names2.add("Smith");
		names2.add("Vijay");
		names2.add("Ramesh");
		names2.add("John");
		
		// names2.remove("Ramesh");
		
		System.out.println(names2);
		System.out.println("Size: " + names2.size());
		System.out.println("-------------");
		
		// TreeSet will store values in sorted order
		Set<String> treeSet = new TreeSet();
		treeSet.add("X");
		treeSet.add("O");
		treeSet.add("L");
		treeSet.add("A");
		System.out.println(treeSet);
		
	}
}
