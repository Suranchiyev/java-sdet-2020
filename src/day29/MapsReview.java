package day29;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsReview {
	public static void main(String[] args) {
		// Map (K, V) -> keys are unique 
		// HashMap does not maintain the insertion order (any order)
		
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(4, "four");
		hashMap.put(3, "three");
		hashMap.put(2, "two");
		hashMap.put(0, "zero");
		hashMap.put(1, "one");
		System.out.println(hashMap);
		
		// Hashtable
		// 1. HashMap is non synchronized(not thread safe) but Hashtable is synchronized (thread safe)
		// 2. HashMap is allows one null key and multiple null values and Hashtable does not allow 
		//    any null keys or values
		Map<Integer, String> hashTable = new Hashtable<>();
		hashTable.put(1, "one");
		hashTable.put(2, "two");
		System.out.println(hashTable);
		System.out.println("----------");
		
		
		// LinkedHashMap does maintain insertion order
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(4, "four");
		linkedHashMap.put(2, "two");
		linkedHashMap.put(1, "one");
		System.out.println(linkedHashMap);
		System.out.println("-----------");
		
		// TreeMap is sorted implementation of Map
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("Asdsf", "four");
		treeMap.put("Axcv", "two");
		treeMap.put("Xxcv", "three");
		treeMap.put("Zxcv", "one");
		treeMap.put("Bxcv", "zero");
		System.out.println(treeMap);
	}
}
