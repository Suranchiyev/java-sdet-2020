package day35;

public interface Box {
	// every non local variable in interface is
	// public static final
	public static final String boxName = "BOX";
	int numberOfBoxes = 100;
	public static final String country = "USA";
	
	// methods can be only public abstract except:
	// 1. default method
	// 2. static method
	void putInside(String item);
	
	public abstract String getItem(int index);
	
	public abstract int getFreeSpace();
	
	public abstract int getNumberOfItems();

	
//  Interface cannot have non abstract methods with body	
//	public void remove() {
//		// some code..
//	}
	// Except:
	// 1. default method
	public default void remove() {
		System.out.println("Remove");
	}
	
	//2. static method
	public static void look() {
		System.out.println("Look");
	}
	
}