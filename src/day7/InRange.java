package day7;

public class InRange {
	public static void main(String[] args) {
		int numberFormTerminal = Integer.parseInt(args[0]);
		System.out.println(inRange(numberFormTerminal));
	}

	// Write method that accepts one int number
	// if the number is within a range from 10 to 20 inclusive return true
	// otherwise return false

	public static boolean inRange(int number) {
		//              and
		if(number >= 10 && number <= 20) {
			return true;
			// if(number <= 20) {
			// 	return true;
			// }else {
			// 	return false;
			// }
		} else {
			return false;
		}
	}


}