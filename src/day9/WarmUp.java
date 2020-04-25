package day9;

public class WarmUp {
	public static void main(String[] args) {
		String str = getNumStr(5);
		System.out.println(str);
	}
	
	public static String getNumStr(int number) {
		if(number == 1) {
			return "One";
		}else if(number == 2) {
			return "Two";
		}else if(number == 3) {
			return "Three";
		}else if(number == 4) {
			return "Four";
		}else if(number == 5) {
			return "Five";
		}else {		
			return String.valueOf(number);
		}
	}
}
