package day23;

import java.util.Scanner;

public class LoopsReview {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide secret word:");
	    String secretWord = sc.next();
		boolean isLimit = false;
	    
	    int count = 1;
		while(!secretWord.equals("apple")) {
			
			if(count == 3) {
				isLimit = true;
				break;
			}
			
			System.out.println("Wrong, try one more time:");
			secretWord = sc.next();
			
			count++;
		}
		
		if(isLimit) {
			System.out.println("Limit is over");
		}else {
			System.out.println("Great! You got it in " + count + "th time");
		}
		
	}
}
