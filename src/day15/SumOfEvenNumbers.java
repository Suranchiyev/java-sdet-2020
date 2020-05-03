package day15;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		int res = getSumOfEvenNum(100);
		System.out.println(res); // 30
	}
	
	public static int getSumOfEvenNum(int number) {
		// number is 10 
		// 2, 4, 6, 8, 10
		// return 30;
		
		// number is 5
		// 2, 4
		// return 6;
		
		// 1) create a variable of type int to store sum of all even numbers
		// 2) for loop to get all the even numbers
		// 3) if i is even add to sum
		// 4) return sum
		
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}		
		}
		
		return sum;
	}
}
