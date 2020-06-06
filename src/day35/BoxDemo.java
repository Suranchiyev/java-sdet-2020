package day35;

public class BoxDemo {
	public static void main(String[] args) {
		//Box box = new Box(); it will not compile
		// We cannot create object from interface directly
		
		Box box = new SmallBox();
		box.putInside("orange");
		box.putInside("apple");
		System.out.println("Free space: " + box.getFreeSpace());
				
		System.out.println("--------");
		Box box1 = new NormalBox();
		box1.putInside("orange");
		box1.putInside("apple");
		System.out.println("Free space: " + box1.getFreeSpace());
		
		Box box2 = new BigBox(); // size 100
		box2.putInside("pen");
		box2.putInside("book");
		System.out.println("Free space: " + box2.getFreeSpace());
		
	}
}
