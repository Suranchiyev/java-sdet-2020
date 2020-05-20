package day25;

import java.util.ArrayList;

public class Countries {
	public static void main(String[] args) {
		ArrayList<String> countries = new ArrayList<>();
		countries.add("USA");
		countries.add("Russia");
		countries.add("Ukraine");
		countries.add("Bolivia");
		countries.add("Kazakhstan");
		
		// .size() -> size of the list
		//       0     5 < 5                  
		
		System.out.println("Size: " + countries.size()); // 5
		for(int i = 0; i < countries.size(); i++) {
			//                               4
			System.out.println(countries.get(i));
		}
		
		countries.remove(4); // remove by index
		// countries.remove("Kazakhstan"); // remove by value
		
		System.out.println("----------");
		for(String str : countries) {
			System.out.println(str);
		}
		
		System.out.println("Size: " + countries.size()); // 4
	}
}
