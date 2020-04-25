package day11;

public class StrContains {
	public static void main(String[] args) {
		// .contains(string) is used to check if strings contains another string
		// it will return boolean
		
		String topic = "Variables, assignment operator, arithmetic operator, input from terminal";
		boolean isThere = topic.contains("input");
		System.out.println(isThere);
		
		System.out.println(topic.contains("java")); // false
		System.out.println(topic.contains("terminal")); // true
		
		System.out.println(topic.contains("input from terminal"));
		System.out.println(topic.contains("Variables, assignment operator, arithmetic operator, input from terminal"));
		
		String name = "John";
	    System.out.println(topic.contains(name)); // false
	}
}
