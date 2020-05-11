package day20;

public class ForEach {
	public static void main(String[] args) {
		int[] numArr = {10, 11, 13, 100, 20, 60, 70, 70, 15, 14};
		// print all the numbers greater than 50 from array
		
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] > 50) {
				System.out.println(numArr[i]);
			}
		}
		
		System.out.println("------------");
		
		for(int num : numArr) {
			if(num > 50) {
				System.out.println(num);
			}
		}
		System.out.println("------------");
		
		String[] names = {"John", "Smith", "Alex", "Core", "Milena"};
		for(String str : names) {
			System.out.println(str);
		}
		
		System.out.println("-----------");
		
		char[] letters = {'a', 'b', 'c', 'd', 'e'};
		for(char ch : letters) {
			System.out.println(ch);
		}
		
		// for each loop. it will get each element one by one.

	}
}
