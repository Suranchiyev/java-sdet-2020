package day25;

import java.util.ArrayList;

public class City {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Aldie");      // 0
		cities.add("Chantilly");  // 1
		cities.add("Hyannis");    // 2
		cities.add("Arlington");  // 3
		cities.add("Karaganda");  // 4
		
		//              4              -1 >= 0  
		for(int i = cities.size() - 1; i >= 0; i--) {
			//                            0
			System.out.println(cities.get(i));
		}
		
		System.out.println("-----------");
		System.out.println(isThere("Hyannis", cities));
		
		System.out.println(cities.contains("Tysons"));
		System.out.println(cities.indexOf("Karaganda"));
		
		cities.clear(); // will remove all elements inside your ArrayList
		System.out.println(cities);
	}
	
	public static boolean isThere(String value, ArrayList<String> list) {
		for(String element : list) {
			if(element.equals(value)) {
				return true;
			}
		}
		
		return false;
	}
}
