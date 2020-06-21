package day44;

public class Swap {
	public static void main(String[] args) {
		int i = 10;
		int j = 15;
		
		j = j - i; // j = 15 - 10 -> j = 5
		i = i + j; // i = 10 + 5  -> i = 15
		j = i - j; // j = 15 - 5  -> j = 10
		
		System.out.println("i = " + i); // 15
		System.out.println("j = " + j); // 10
	}
}
