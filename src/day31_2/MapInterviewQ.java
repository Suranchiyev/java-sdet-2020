package day31_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterviewQ {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		
		Map<Integer, String> evenMap = new HashMap<>();
		Map<Integer, String> oddMap = new HashMap<>();

		// [K, V][K, V]
		Set<Integer> keys = map.keySet();
		
		for(Integer key : keys) {
			if(key % 2 == 0) {
				evenMap.put(key, map.get(key));
			}else {
				oddMap.put(key, map.get(key));
			}
		}
		
		System.out.println(evenMap); // {2=B, 4=D, 6=F}
		
		System.out.println(oddMap); // {1=A, 3=C, 5=E}
		
		// 1. Get keySet() to iterate over the main map
		// 2. Find out if key is even or odd
		// 3. if key is even add entity to evenMap otherwise to oddMap
	}
}
