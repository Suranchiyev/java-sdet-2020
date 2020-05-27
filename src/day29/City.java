package day29;

import java.util.HashMap;
import java.util.Map;

public class City {
	public static void main(String[] args) {
		Map<String, Integer> cities = new HashMap<>();
		cities.put("Arlington", 229164);
		cities.put("Leesburg", 375629);
		cities.put("Manassas", 451721);
		cities.put("Richmond", 210309);
		cities.put("Alexandria", 147391);
		cities.put("Norfolk", 245782);
		
		// TODO Get total population from map cities
		// 1. Create a variable for total population
		// 2. Loop over the map using keySet()
		// 3. Keep adding the population from each city to created variable
		// 4. Print the variable
		
		int totalPopulation = 0;
		for(String key : cities.keySet()) {
			totalPopulation += cities.get(key);
		}
		
		System.out.println("Total population is " + totalPopulation);
		
	}
}
