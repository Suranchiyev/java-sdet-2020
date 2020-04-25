package day11;

public class StrEqual {
	public static void main(String[] args) {
		// To compare two Strings we use .equals(String) method
		// it will return true if they are equal
		// Never use == operator to compare strings
		
		String box = "apple";
		String box1 = "apple";
		
		if(box.equals(box1)) {
			System.out.println("They are equal");
		} else {
			System.out.println(box + " is not equal to " + box1);
		}
		
		System.out.println(box.equals(box1));
		System.out.println(box == box1); // Never use it to compare Strigns
		
		String name = "John";
		String name1 = new String("John");
		
		System.out.println(name);
		System.out.println(name1);
		
		System.out.println(name.equals(name1));  // true
		System.out.println(name == name1);       // false
		
	}
}
