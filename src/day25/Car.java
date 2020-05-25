package day25;

import java.lang.String;
import java.util.ArrayList;

public class Car {
	public static void main(String[] args) {
		String str = "";
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Volvo");
		System.out.println(cars);
		
		// Print 3th element
		System.out.println(cars.get(2));
		System.out.println(cars.get(1));
		System.out.println(cars.get(0));
		
		cars.add("Mazda");
		System.out.println(cars);
		
		cars.remove(0); // by index
		System.out.println(cars);
		
		cars.remove("Ford"); // by value
		System.out.println(cars);
		
		cars.set(1, "Honda");
		System.out.println(cars);
	}
}
