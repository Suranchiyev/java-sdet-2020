package day20;

public class ArrayRecap {
	public static void main(String[] args) {
		int[] num = new int[3];
		//  0   1  2
		// [6][19][21]
		
		num[0] = 6;
		num[1] = 19;
		num[2] = 21;
		
		int[] num1 = {1, 2, 3, 4, 5, 6};
		
		int[] num2 = new int[] {1, 2, 3, 4, 5, 6};
		//  0  1  2  3  4  5
		// [1][2][3][4][5][6]
		
		for(int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
		
		String[] cities = {"Aldie"};
		// ["Aldie"]
		System.out.println(cities[0]);
		// System.out.println(cities[1]); Index out of bound
	}
}
