package day31_2;

public class Interview1 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		// 1. print each number from array one by one
		// 2. if number is evenly divisible by 5 print "Java" instead of number
		// 3. if number is evenly divisible by 3 print "Great" instead of number
		// 4. if number is evenly divisible by 3 and by 5 print "Great Java" instead of number
		
		for(int num : nums) {
			if(num % 5 == 0 && num % 3 == 0) {
				System.out.println("Great Java");
			} else if(num % 3 == 0) {
				System.out.println("Great");
			} else if(num % 5 == 0) {
				System.out.println("Java");
			} else {
				System.out.println(num);
			}	
		}
	}
}
