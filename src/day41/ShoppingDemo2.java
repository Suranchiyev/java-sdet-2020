package day41;

public class ShoppingDemo2 {
	public static void main(String[] args) {
		ShoppingBalanceLazy wife = ShoppingBalanceLazy.getInstance();
		wife.buy("head phone", 300.00);
		
		ShoppingBalanceLazy husband =  ShoppingBalanceLazy.getInstance();
		husband.buy("phone", 500.00);
		husband.buy("charger", 40.00);
		
		wife.buy("phone case", 25.00);
	}
}
