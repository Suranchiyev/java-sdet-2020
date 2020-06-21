package day44;

public class Words {
	public static void main(String[] args) {
		String str = "apple";
		String str1 = "apple";
		
		// string pool is not used
		String str2 = new String("apple"); 
		
		// == when used with references(objects) if they are pointing to the same object
		System.out.println(str == str1); // true. It means they point to the same object
		System.out.println(str == str2); // false. new String("apple") get new object
		System.out.println(str.equals(str2)); // true. equals() compares actual content
		
	}
}
