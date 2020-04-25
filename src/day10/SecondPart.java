package day10;
import java.util.*;

public class SecondPart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide a word with even length:");
		
		String word = sc.next();
		
		if(word.length() % 2 == 0) {
			String secondPart = word.substring(word.length() / 2);
			System.out.println(secondPart);
			
		}else {
			System.out.println("Not valid input");
		}
	}
	
	/**
	 * Ask from user string with even length
	 * if the word length is not even print 'Not valid input'
	 * split word in the middle and print second part
	 * 
	 * 
	 * 0123 -> 23
	 * qwertyui -> tyui
	 * 1234567891 -> 67891
	 */
}
