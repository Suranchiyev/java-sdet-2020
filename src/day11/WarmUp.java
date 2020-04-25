package day11;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(isValidAmount("$200.01 USD")); // false
		System.out.println(isValidAmount("$1200.00 USD")); // true
		System.out.println(isValidAmount("$900.99 USD")); // false
		System.out.println(isValidAmount("$100000.00 USD")); // true
	}
	
	public static boolean isValidAmount(String amount) {
		amount = amount.substring(1, amount.indexOf(" ")); 	
//		amount = amount.replace("$", "");
//		amount = amount.replace("USD", "");
		
		double dAmount = Double.parseDouble(amount);
		if(dAmount >= 1000.00) {
			return true;
		}else {
			return false;
		}
	}
}
