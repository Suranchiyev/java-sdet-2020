package day29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Fruit {
	public static void main(String[] args) {
		//    K       V
		Map<String, Double> fruit = new HashMap<>();
		
		// [K, V][K, V][K, V][K, V]
		// Map can work only with Objects(no primitives)
		// Only unique keys are allowed 
		
		// Use put(K, V); to add entity (element) to the map
		//           K    ,   V
		fruit.put("Orange", 1.05);
		fruit.put("Mango", 0.50);
		fruit.put("Apple", 0.76);
		fruit.put("Lemon", 1.47);
		fruit.put("Watermelon", 3.28);
		fruit.put("Banana", 1.39);
		
		System.out.println(fruit);
		
		// Use get(K) method to get the value. Keys are case sensitive 
		Double lemonPrice = fruit.get("Lemon");
		System.out.println("Price for Lemon: " + lemonPrice);
		
		System.out.println("Price for Mango: " + fruit.get("Mango"));
		
		// double kiwiPrice = fruit.get("Kiwi"); // Primitives cannot hold null
        
		// if key is not the map, it will return null
		Double kiwiPrice = fruit.get("Kiwi");
		
		
		// Get sum of price for Orange, Apple and Mango
		Double sum = fruit.get("Orange") + fruit.get("Apple") + fruit.get("Mango");
		System.out.println("Total price for Orange, Apple and Mango: " + sum);
			
		fruit.put("Kiwi", 1.40);	
		System.out.println(fruit);
		
		// containsKey(K) returns true if key is in the map, otherwise false
		boolean b = fruit.containsKey("kiwi");
		System.out.println("Key 'kiwi' is in the map: " + b);
		
		if(fruit.containsKey("Orange")) {
			System.out.println("Price: " + fruit.get("Orange"));
		}else {
			System.out.println("Item is not there");
		}
		
		// containsValue(V)
		System.out.println(fruit.containsValue(1.47));
		
		// remove(K) removes the key/value pair for this key
		// Does nothing if the key is not present
		System.out.println(fruit);
		fruit.remove("Watermelon");
		System.out.println(fruit);
		
		fruit.put("Apple", 1.0);
		fruit.put("Orange", 1.0);
		System.out.println(fruit);
		
		// replace(K, V) it will replace the value of existing key 
		// If key is not there, it does nothing
		fruit.replace("lemon", 2.47);
		System.out.println(fruit);
		
		// keySet() it will return all the keys of map as Set<K>
		Set<String> keys = fruit.keySet();
		System.out.println("All keys: " + keys);
		
		// [K, V] [K, V], [K, V]
		for(String key : keys) {
			System.out.println(key + " : " + fruit.get(key));
		}
		
		// put(K, V) - add entity to the map
		// get(K) - it will return value of key (if not there -> null)
		// containsKey(K) - check if key is in the map
		// remove(K) - remove entity from map by key
		// keySet() -> returns all the keys of map as Set<K>
		
		// 10 min break till 8:10 PM
	}
}
