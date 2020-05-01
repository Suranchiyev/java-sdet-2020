package day14;

public class DoWhile {
	public static void main(String[] args) {
		int count = 0;
		
		while (count < 100) {
			System.out.print(count + " ");
			count++;
		}
		
		System.out.println("\n");
		
		int count1 = 0;
		do {
			System.out.print(count1 + " ");
			count1++;
			
		} while(count1 < 100);	
	}
}
