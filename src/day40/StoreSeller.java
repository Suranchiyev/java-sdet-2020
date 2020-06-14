package day40;

public class StoreSeller {
	public static void main(String[] args) {
		Store seller = new Store();
		System.out.println(seller.getItems());
		
		seller.addItem("apple", 4.5);
		seller.addItem("orange", 3.9);
		seller.addItem("banana", 1.3);
		System.out.println(seller.getItems());
		
		seller.addItem("kiwi", 7.7);
	}
}
