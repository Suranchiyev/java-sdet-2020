package day13;
import java.util.Scanner;

public class BreakAString1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide a word: ");
		String str = sc.next();
		
		// TODO
		// Write a program that will print every other letter from str variable in the same line.
		// str = "apple"     -> ape
		// str = "banana"    -> bnn
		// str = "123456789" -> 13579
		// HINT: index += 2 (index = index + 2)
		
		int index = 0;
		//   5
		int len = str.length();
		//     6    < 5
		while(index < len) {
			// 01234
			// apple
			//                            4
			System.out.print(str.charAt(index));
			//6
			index = index + 2;
		}
		
		System.out.println();
		System.out.println(index);
	}
}
