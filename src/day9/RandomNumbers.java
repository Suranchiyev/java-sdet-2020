package day9;
import java.util.Random;


public class RandomNumbers {
	public static void main(String[] args) {
		Random random = new Random();
		
		//                      0 -> 5       
		int rNumber = random.nextInt(6);
		System.out.println(rNumber);
		
		if(rNumber == 0) {
			System.out.println("Vladyslav");
		}else if(rNumber == 1) {
			System.out.println("Grigore");
		}else if(rNumber == 2) {
			System.out.println("Jildiz");
		}else if(rNumber == 3) {
			System.out.println("Cristina");
		}else if(rNumber == 4) {
			System.out.println("Andrei");
		}else {
			System.out.println("Boris");
		}
	}	
}
