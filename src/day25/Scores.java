package day25;

import java.util.ArrayList;

public class Scores {
	public static void main(String[] args) {
		// ArrayList cannot have primitives, we need to use wrapped classes 
		
		ArrayList<Double> scores = new ArrayList<>();
		scores.add(89.9);
		scores.add(100.0);
		scores.add(78.8);
		scores.add(99.9);
		scores.add(65.6);
		
		System.out.println(scores);
		//                  Double
		Double lastScore = scores.get(4);
		
		double sum = 0;
		for(int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
		}
		System.out.println("Sum: " + sum);
		
		// find out sum of the scores that above 70.0
		double sumAbove70 = sum70(scores);
		System.out.println("Sum above 70: " + sumAbove70);
	}
	
	// 1. return type - double
	// 2. method argument(what it should accept) - ArrayList<Double>
	// 3. Logic to get sum of number that above 70 
	
	public static double sum70(ArrayList<Double> list) {
		//  byte -> short -> int -> long -> float -> double
		double sum = 0.0;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > 70) {
				sum += list.get(i);
			}
		}
		
		return sum;
	}
}
