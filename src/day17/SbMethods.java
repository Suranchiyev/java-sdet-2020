package day17;

public class SbMethods {
	public static void main(String[] args) {
		// charAt(), indexOf(), length(), substring()
		// These methods work exactly the same as in the String class
		
		StringBuilder day = new StringBuilder("Thursday");
		char ch = day.charAt(2);
		System.out.println(ch); // u
		
		int index = day.indexOf("d");
		System.out.println(index);
		
		System.out.println(day.length());
		
		// substring() method will return String
		String subStr = day.substring(0, 4);
		System.out.println(subStr);
		
		System.out.println("-------------------");
		// creating empty stringBuilder
		StringBuilder sb = new StringBuilder();
		// sb = "wooden spoon"; will not work
		sb.append("wooden spoon");
		
		// method chaining
		sb.append("display").append("settings").append("apple");
		System.out.println(sb); // wooden spoondisplay
		
		StringBuilder sb1 = sb.append("orange");		
		//sb.append("banana").substring(0,2);
		
		System.out.println("-------------------");
		// insert() method add characters to StringBuider at the requested index
		//                                     0123456
		StringBuilder sb2 = new StringBuilder("animals");
		sb2.insert(7, "-"); 
		System.out.println(sb2);
		
		sb2.insert(3, "-");
		System.out.println(sb2);
		
		sb2.insert(0, "-");     //  0123456789
		System.out.println(sb2); // -ani-mals-
		
		sb2.insert(8, " i");
		System.out.println(sb2); // 
		
		String str = " apple";
		sb2.insert(12, str);
		System.out.println(sb2);
		
		//                                     0123456
		StringBuilder sb3 = new StringBuilder("John programmer");
		// can you use instert method that sb3 value will be "John is programmer"
		sb3.insert(4, " is");
		System.out.println(sb3); //John is programmer
		System.out.println("--------------");
		
		// delete(int start, int end) and deleteCharAt(int index)
		// delete() removes characters based on start and end indexes
		// deleteCharAt() remove single character based its index
		
		//                                     012345
		StringBuilder sb4 = new StringBuilder("abcdef");
		sb4.delete(1, 3);         //0123
		System.out.println(sb4); // adef
		
		sb4.delete(1, 2); //aef
		System.out.println(sb4);
		
		StringBuilder sb5 = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		// TODO
		// can you get first and last characters using delete method -> "az"
		sb5.delete(1, sb5.length() - 1);
		System.out.println(sb5); // az
		
		StringBuilder sb6 = new StringBuilder("wooden spoon");
		//                      01234
		sb6.deleteCharAt(0); // ooden spoon
		System.out.println(sb6);
		sb6.deleteCharAt(4);
		System.out.println(sb6);
		
		System.out.println("-------------------");
		StringBuilder sb7 = new StringBuilder("John Doe");
		System.out.println(sb7);
		sb7.reverse();
		System.out.println(sb7);
		
		String str1 = sb7.toString();
		
		String name = "John Doe 2";
		StringBuilder sbName = new StringBuilder(name);
		
	}
}
