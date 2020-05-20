package day25;

import java.util.Arrays;
import java.util.ArrayList;

public class Names {
	public static void main(String[] args) {
		String[] namesArr = new String[3];
		// [null][null][null]
		namesArr[0] = "John";
		namesArr[1] = "Bob";
		namesArr[2] = "Smith";
	    //namesArr[3] = "Vikas";
		
		namesArr[1] = "Alex";
		
		System.out.println(namesArr);
		System.out.println(Arrays.toString(namesArr));
		
		System.out.println(namesArr[0]);
		
		System.out.println("----------");
		
		ArrayList<String> namesList = new ArrayList<>();
        //     0     1         2     3
		// ["John"]["Bob"]["Smith"]["Vikas"]
		namesList.add("John");
		namesList.add("Bob");
		namesList.add("Smith");
		namesList.add("Vikas");
		
		namesList.set(1, "Alex");
		
		System.out.println(namesList); 
		System.out.println(namesList.get(1));
		
		String name = namesList.get(3);
		System.out.println(name);
	}
}
