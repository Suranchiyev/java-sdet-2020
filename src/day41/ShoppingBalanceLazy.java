package day41;

public class ShoppingBalanceLazy {
	private double balance;
	
	private static ShoppingBalanceLazy instance;
	
	private ShoppingBalanceLazy(double balance) {
		this.balance = balance;
	}
	
	public static ShoppingBalanceLazy getInstance() {
		if(instance == null) {
			System.out.println("Setting up initial balance");
			instance = new ShoppingBalanceLazy(1000.00);
			return instance;
		}else {
			System.out.println("Balance is exist, returnning old one");
			return instance;
		}
	}
	
	public void buy(String item, double price) {
		balance = balance - price;
		
		System.out.println("Bought: " + item);
		System.out.println("Price: " + price);
		System.out.println("Remaining balance: " + balance);
		System.out.println("-----------");
	}
}
