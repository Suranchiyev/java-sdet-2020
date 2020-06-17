package day41;

public class ShoppingBalance {
	private double balance;
	
	// With private constructor there is no way to create an object outside of this class
	private ShoppingBalance(double balance) {
		// super();
		this.balance = balance;
	}
	
	// This is single final object that will be used everywhere 
	private static final ShoppingBalance instance = new ShoppingBalance(1000.00);
	
	// This is public method to get single object
	public static ShoppingBalance getInstance() {
		return instance;
	}
	
	public void buy(String item, double price) {
		balance = balance - price;
		
		System.out.println("Bought: " + item);
		System.out.println("Price: " + price);
		System.out.println("Remaining balance: " + balance);
	}
}
