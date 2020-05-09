package day19;

public class Fruit {
	public static void main(String[] args) {
		// int[] score = new int[5];
		// DataType[] nameOfAray = new DataType[arraySize];
		
		String[] fruit = new String[4];
		// [null][null][null][null]
		
		//      0       1        2        3
		// ["orange"]["kiwi"]["banana"]["apple"]
		fruit[0] = "orange";
		fruit[1] = "kiwi";
		fruit[2] = "banana"; // cherries
		fruit[3] = "apple";
		
		String str = fruit[2];
		System.out.println(str);
		
		// [String 0][String 1][String 2][String 3]
		
		fruit[0] = fruit[0].toUpperCase();
		
		// ["ORANGE"]["kiwi"]["cherries"]["apple"]
		fruit[2] = "cherries";
		
		System.out.println("------------");
		fruit[3] = "blueberries";
		
		System.out.println(fruit[0]);
		System.out.println(fruit[1]);
		System.out.println(fruit[2]);
		System.out.println(fruit[3]);
		
		// replace "apple" in fruit array to "blueberries"
		// print each element in the new line
	}
}
