package day12;

public class TernaryOperator {
	public static void main(String[] args) {
		int y = 10;
		int x;
		
		if(y > 5) {
			x = y * 2;
		}else {
			x = y * 3;
		}
		System.out.println(x);
		
		//     F    ? 10 * 2  :  10 * 3
		x = (y > 5) ? (y * 2) : (y * 3);	
		System.out.println(x);
	}
}
