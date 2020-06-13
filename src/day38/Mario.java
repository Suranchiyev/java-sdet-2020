package day38;

public class Mario {
	public static void main(String[] args) {
		String input = "5";
		
		if(!(isNumeric(input) && inRange(Integer.parseInt(input)))) {
			System.out.println("INVALID INPUT");
			return;
		}
		
		int num = Integer.parseInt(input);
		System.out.println(num);
		
		String partEmpty = " ";
		
		for(int i = 3; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print(partEmpty);
			}
			
	
		    System.out.print("#");
			
			
			System.out.println();
		}
		
		
		
	}
	
	public static boolean inRange(int num) {
		return num >= 1 && num <= 8;
	}
	
	public static boolean isNumeric(String num) {
		try {
			Integer.parseInt(num);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
}
