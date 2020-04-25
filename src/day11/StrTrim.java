package day11;

public class StrTrim {
	public static void main(String[] args) {
		// .trim() is used to remove the spaces around the string
		// it will return string with no spaces
		
		// "$100.00 USD  "
		String actualAmount = "  $100.00 USD  ";
		String expectedAmount = "$100.00 USD";
		
		//actualAmount = actualAmount.trim();
		
		if(actualAmount.trim().equals(expectedAmount)) {
			System.out.println("TEST PASS");
		}else {
			System.out.println("TEST FAILED");
		}
	}
}
