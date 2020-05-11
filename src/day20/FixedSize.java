package day20;

import java.util.Arrays;

public class FixedSize {
	public static void main(String[] args) {
		// Array is collection of variables of same type
		// Array is fixed size (immutable)
		
		// [Ljava.lang.String;@7852e922
		String[] car = new String[4];
		car[0] = "BMW";
		car[1] = "Audi";
		car[2] = "Mercedes";
		car[3] = "Toyota";
		
		// car[4] = "Honda"; Array Index out of bound exception
		System.out.println(Arrays.toString(car));
		
		// [BMW, Audi, Mercedes, Toyota]
		// [BMW, Audi, Mercedes, Toyota, Honda]
		
		
		
		String[] carCopy = new String[5];
		carCopy[0] = car[0];
		carCopy[1] = car[1];
		carCopy[2] = car[2];
		carCopy[3] = car[3];
		carCopy[4] = "Honda";
		
		car = carCopy;
		System.out.println(Arrays.toString(car));	
	}
}
