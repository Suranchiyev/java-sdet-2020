package day35;

public class NormalBox implements Box {
	private String[] box = new String[15];
	private int numberOfItems;
	
	@Override
	public void putInside(String item) {
		for(int i = 0; i < box.length; i++) {
			if(box[i] == null) {
				box[i] = item;
				numberOfItems++;
				return;
			}
		}
	}
	
	@Override
	public String getItem(int index) {
		return box[index];
	}
	
	@Override
	public int getFreeSpace() {
		return box.length - numberOfItems;
	}
	
	@Override
	public int getNumberOfItems() {
		return numberOfItems;
	}
}
