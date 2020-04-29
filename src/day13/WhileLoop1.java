package day13;
import java.util.Scanner;

public class WhileLoop1 {
	public static void main(String[] args) throws Exception {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		
		// 6
		// 1 2 3 4 5 6
		int count = 1;
		
		//     7    <=   6 -> false
		while(count <= number) {  
			System.out.print(count + " ");
			Thread.sleep(1000);
			count++;
		}
		
	}
}
