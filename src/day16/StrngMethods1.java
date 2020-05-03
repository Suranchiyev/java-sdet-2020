package day16;

public class StrngMethods1 {
	public static void main(String[] args) {
		// .indexOf(String);
		// What does indexOf(String) method do?
		
		//            012345
		String str = "helloo";
		int index = str.indexOf("o");
		System.out.println(index);
		
		int indexLast = str.lastIndexOf("o");
		System.out.println(indexLast);
		
		printIndexes("hello hello operator", 'o');
		
		System.out.println("\n");
		
		//printIndexes("hello", 'l');
		
		// substring(startIndex);
		// substring(startIndex, endIndex);
		
		//             0123456789012345678
		String str1 = "apple banana orange";
		
		System.out.println(str1.substring(13)); //orange
		System.out.println(str1.substring(6, 12)); // banana
		System.out.println(str1.substring(0, 5)); // apple
		
		// .equals(String) to compare strings 
		
		String a = "city";
		String b = "city";
		
		if(a.equals(b)) { 
			System.out.println(a + " equals " + b);
		}
		
		// contains(string)
		String colorBox = "red, black, white";
		System.out.println(colorBox.contains("red, b"));
		System.out.println(colorBox.startsWith("white")); // false
		System.out.println(colorBox.endsWith("white")); // true	
	}
	
	public static void printIndexes(String str, char letter) {	
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == letter) {
				System.out.print(i + " ");
				// break till 11:14 AM
			}
		}
	}
}
