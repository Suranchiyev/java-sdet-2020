package day12;

public class GroceryStore {
	public static void main(String[] args) {
		double price = getItemPrice("apple");
		System.out.println(price);
	}

	/**
	 * bread    -> 4.99
	 * water    -> 2.99
	 * apple    -> 1.50
	 * bear     -> 7.90
	 * red bull -> 2.59 
	 * 
	 * return price based on above list. If item is not in the list return 0.00
	 * Use switch statement
	 * 
	 * - YOu need to return a price. Not print
	 * - You face issue with break. Because return will exit the method 
	 */
	public static double getItemPrice(String item) {
		double price;	
		switch(item) {
		case "bread":
			price = 4.99;
			break;
		case "water":
			price = 2.99;
			break;
		case "apple":
			price = 1.50;
			break;
		case "bear":
			price = 7.90;
			break;
		case "red bull":
			price = 2.59;
			break;
		default:
			price = 0.00;
			break;	
		}
		
		return price;
	}
	// LUNCH 1:02 PM EST
}
