package day16;
import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide a number:");
		
		int number = scanner.nextInt();
		
		outer:
		for(int j = 0; j < number; j++) {
			String block = "#";
			innerOne:
			for (int i = 0; i < number; i++) {
				System.out.println(block);
				block = block + "#";
			}

			innerTwo:
			for (int i = 0; i <= number; i++) {
				System.out.println(block.substring(0, block.length() - i));
			}
		}
		// nested loops
	}
}
