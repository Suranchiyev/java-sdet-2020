package day34;

import java.util.ArrayList;
import java.util.List;

public class AppleDemo {
	public static void main(String[] args) {
		Apple obj = new Apple();
		obj.type = "Aport";
		obj.color = "red";
		// every class in Java extends Object
		
		// toString()
		System.out.println(obj);
		
		// getClass();
		System.out.println(obj.getClass());
		
		
		// equals()
		// hashCode()
		List<Apple> list = new ArrayList<>();
		list.add(new Apple("Limon", "green"));
		list.add(new Apple("T1", "red"));
		
		List<Apple> list2 = new ArrayList<>();
		list2.add(new Apple("Limon", "green"));
		list2.add(new Apple("T1", "red"));
		
	    boolean isListsEqual = list.equals(list2);
		System.out.println("Are they equal: " + isListsEqual);
	}
}
