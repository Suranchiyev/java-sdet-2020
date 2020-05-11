package day20;

import java.util.Arrays;

public class FixedSize1 {
	public static void main(String[] args) {
		String[] car = new String[4];
		car[0] = "BMW";
		car[1] = "Audi";
		car[2] = "Mercedes";
		car[3] = "Toyota";
		
		System.out.println(Arrays.toString(car));
		car = addElement(car, "Honda");
		System.out.println(Arrays.toString(car));
		car = addElement(car, "Jeep");
		System.out.println(Arrays.toString(car));
		//   0     1     2         3       4      5
		// [BMW, Audi, Mercedes, Toyota, Honda, Jeep]
		// [BMW, Audi, Mercedes, Honda, Jeep]
		car = removeByIndex(car, 3);
		System.out.println(Arrays.toString(car));
		
		car = removeByIndex(car, 0);
		System.out.println(Arrays.toString(car));
	}
	
	public static String[] removeByIndex(String[] arr, int index) {
		String[] arrCopy = new String[arr.length-1];
		int aIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i == index) {
				// continue keyword will skip iteration
				continue;
			}
			
			arrCopy[aIndex] = arr[i];
			aIndex++;
		}
		
		return arrCopy;
	}
	
	public static String[] addElement(String[] arr, String value) {
		
		String[] arrCopy = new String[arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			arrCopy[i] = arr[i];
		}
		
		arrCopy[arrCopy.length - 1] = value;
		
		return arrCopy;
		
	}
}
