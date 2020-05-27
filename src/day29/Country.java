package day29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Country {
	public static void main(String[] args) {
		//    K   ,  V
		Map<String, String> country = new HashMap<>();
		country.put("USA", "washington");
		country.put("Canada", "ottawa");
		country.put("Brazil", "brasilia");
		
		// TODO print each entity in this format:
		// K : V  (USA : washington)
//		
//		System.out.println("USA : " + country.get("USA"));
//		System.out.println("Canada : " + country.get("Canada"));
//		System.out.println("Brazil : " + country.get("Brazil"));
		
		// keySet() method will return all the keys from map as Set<K>
		// [K][K][K]
		Set<String> myKeys = country.keySet();
		System.out.println(myKeys);
		
		for(String key : myKeys) {
			//                 Canada  :   ottawa 
			System.out.println(key + " : " + country.get(key));
		}
		
		System.out.println("-------------");
		System.out.println(country);
		
		// change a map -> make values first letter as upper case
		for(String key : country.keySet()) {
			String val = country.get(key);
			val = val.substring(0, 1).toUpperCase() + val.substring(1);
			// country.put(key, val);
			country.replace(key, val);
		}
		
		System.out.println(country);
	}
}
