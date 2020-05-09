package day19;

public class Assignment1 {
	public static void main(String[] args) {
		String[] strArr = new String[3];
		System.out.println(strArr[0]);  // null
		System.out.println(strArr[1]);  // null
		System.out.println(strArr[2]);  // null
		
		int[] numArr = new int[100];
		System.out.println(numArr[0]);  // 0
		System.out.println(numArr[99]); // 0
		
		System.out.println("------------");
		
//		int[] number = new int[3];
//		number[0] = 1;
//		number[1] = 10;
//		number[2] = 100;
		
		int[] number = {1, 10, 100};
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		
		System.out.println("--------");
		//                      0      1   2  3    4   5
		double[] temperature = {30.5, 29, 28, 35, 27, 31.9};
		System.out.println(temperature[0]);
		System.out.println(temperature[5]);
		
		System.out.println("--------");
		String[] team = {"John", "Smith", "Ramesh", "Vijay"};
		System.out.println(team[0]);
		System.out.println(team[1]);
		System.out.println(team[2]);
		System.out.println(team[3]);
		
		
	}
}
