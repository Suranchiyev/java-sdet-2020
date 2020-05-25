package day28;

public class Varargs {
	public static void main(String[] args) {
		printLines("Hello");
		
		printLines("Good", "Morning");
		
		printLines("A", "B", "C");
		
		printLines("1", "2", "3");
		
	}
	
	public static void printLines(String ... strings) {
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
}
