package day41;

public class ShoppingDemo {
	public static void main(String[] args) {
		ShoppingBalance member1 = ShoppingBalance.getInstance();
		member1.buy("head phone", 300.00);
		System.out.println("--------");
		
		ShoppingBalance member2 = ShoppingBalance.getInstance();
		member2.buy("phone", 500.00);
		System.out.println("--------");
		
		member2.buy("charger", 40.00);
		System.out.println("--------");
		
		member1.buy("phone case", 25.0);
		
 	}
}
