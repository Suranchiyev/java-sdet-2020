package day41_2;

public abstract class Food {
	private int quantity;
	
	public Food(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public abstract void consumed();
}
