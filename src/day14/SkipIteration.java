package day14;

public class SkipIteration {
	public static void main(String[] args) {
		// program that will print numbers from 1 to 100
		// but it will skip 7, 13 and 9
		
		for(int i = 1; i <= 100; i++) {
			if(i == 7 || i == 13 || i == 9) {
				// skip rest of the code in this iteration and start next one
				continue;
			}
			
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		String name = "J$o$h%n%";
		// John
		// $, %
		System.out.println(name);
		
		//                     8
		for(int i = 0; i < name.length(); i++) {
			
			char letter = name.charAt(i);
			if(letter == '$' || letter == '%') {
				continue;
			}
			System.out.print(letter);
		}
		
		// what does break keyword do inside a loop? It will stop the loop.
		// what does continue keyword do? It will skip rest of the code in this iteration and start next one
	}
}
