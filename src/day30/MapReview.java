package day30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapReview {
	public static void main(String[] args) {
		// Map is key value pair data structure
		// Map can hold only unique keys
		// Map can hold only Objects as key and value
		
		Map<String, Double> students = new HashMap<>();
		
		// put(K, V) to add entity
		students.put("John", 90.0);
		students.put("Smith", 65.5);
		students.put("John", 80.0); // it will override old entity
		students.put("Alex", 100.0);
		
		// get(K) to get the value based on the key
		Double score = students.get("John");
		System.out.println("Johns score: " + score);
		
		// remove(K) it will remove entity from the map
		students.remove("Smith");
		System.out.println(students);
		
		if(students.containsKey("Ramesh")) {
			Double score1 = students.get("Ramesh");
			System.out.println(score1);
		}else {
			System.out.println("There is no Ramesh in the map");
		}
		
		// Map<String, Double> students = new HashMap<>();
		// keySet() will return all the keys from map as Set<K>
		
		//   
		// [K,V] [K,V] [K,V] [K,V]
		
		// [k][k][k][k]
		Set<String> keys = students.keySet();
		System.out.println(keys);
		
		for(String key : keys) { 
			// replace(K, new value) 
			students.replace(key, 0.0);
		}
		
		System.out.println(students);
	}
}
