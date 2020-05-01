package day14;

public class BreakALoop {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i == 3) {
				// when break keyword is used the program will exit from the loop
				break;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		int count = 0;
		while(count < 10) {
			if(count == 7) {
				break;
			}
			
			System.out.print(count + " ");
			count++;
		}	
	}
}
