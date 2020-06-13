package day38;

public class Store {
	public String[] items;

	public Store(int itemSize) {
		items = new String[itemSize];
	}

	public void addItem(int index, String item) {
		try {
			items[index] = item;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index: " + index + ". For size: " + items.length);
		}
	}

	public static void main(String[] args) {
			Store obj = new Store(5);
			obj.addItem(0, "apple");
			obj.addItem(10, "orange");
	
	}
}
