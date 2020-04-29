package day13;

public class InterestRate {
	public static final double INTEREST_RATE = 1.5;
	
	public static void main(String[] args) {
		double balance = 50000.00;
		double initialBalance = balance;
		
		int months = 36;
		
		int count = 0;
		while(months > count) {	
			balance = balance + (balance * INTEREST_RATE / 100);
			count++;
		}
		
		balance = Math.round(balance);
		
		System.out.println("Total balance:  " + balance);
		System.out.println("Initial balance: " + initialBalance);
		System.out.println("Iterest earned: " + (balance - initialBalance));
		System.out.println("Period(Months): " + months);
	}
}
