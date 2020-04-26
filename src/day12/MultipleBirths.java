package day12;
import java.util.Scanner;

public class MultipleBirths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfBabies;
		System.out.println("Enter number of babies:");
		numberOfBabies = sc.nextInt();
		
		switch(numberOfBabies) {
		case 1:
			System.out.println("Congratulations!");
			break;
		case 2:
			System.out.println("Wow. Twins");
			break;
		case 3:
			System.out.println("Wow. Triplets");
			break;
		case 4:
		case 5:
			System.out.println("Unbelievable! " + numberOfBabies + " babies");
			break;
		default:
			System.out.println("I don't believe you");
			break;
		}
	}
}
