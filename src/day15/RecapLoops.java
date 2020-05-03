package day15;

public class RecapLoops {
	public static void main(String[] args) {
		// while loops
		
		int count = 0;
		while(count < 10) 
		{
			System.out.print(count + " ");
			count++;
		}
		
		int count1 = 0;
		do {
			System.out.println(count1);
			count1++;
		}while(count1 < 10);
		
		
		// for loop	
		for(int i = 0, g = 3 ; i < 1000 || g < 4 ; i++, g++) 
		{
			int num = 4;
			boolean b = false;
			
			continue;
			// some code 
		}
		// System.out.println(num);
		
		for(;;) 
		{
			System.out.println("Hello!");
			break;
		}
	}
}
