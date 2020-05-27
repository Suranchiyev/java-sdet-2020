package day29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FruitStore {
	public static void main(String[] args) {
		// K - item number
		// V - price for item
		Map<Integer, Double> items = new HashMap<>();
		items.put(1, 1.05);
		items.put(22, 0.50);
		items.put(3, 0.76);
		items.put(40, 2.05);
		items.put(5, 3.28);
		items.put(6, 6.5);
		items.put(10, 0.99);
		
		// Print items with prices greater than $1.00
		Set<Integer> keys = items.keySet();
		for(Integer key : keys) {
			if(items.get(key) > 1.0) {
				System.out.println("Item number - "+key + " : " + "Price - $" + items.get(key));
			}
		}
		
		// Get the most expensive item from map items
		double maxPrice = 0.0;
		int maxItemNumber = -1;
		for(Integer key : items.keySet()) {
			if(maxPrice < items.get(key)) {
				maxPrice = items.get(key);
				maxItemNumber = key;
			}
		}
		
		System.out.println("Item number " + maxItemNumber + " is most expensive item: $" + maxPrice);
		
		
		// Increase each price by $1
		// replace(key, val);
		System.out.println(items);
		for(Integer key : items.keySet()) {
			Double value = items.get(key) + 1.0;
			items.replace(key, value);
		}
		System.out.println(items);
		
	}
}
