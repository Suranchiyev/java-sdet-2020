package day28;

import java.util.ArrayList;
import java.util.List;

public class ValAndRef {
	public static void main(String[] args) {
		int num = 5;
		
		System.out.println(num);
		changeVal(num);
		
		System.out.println(num);
		
		List<String> list = new ArrayList<>();
		list.add("orange");
		System.out.println(list);
		
		changeVal(list);
		
		System.out.println(list);
	}
	
	public static void changeVal(List<String> list) {
	    list.set(0, "apple");
//		list = new ArrayList<>();
//		list.add("apple");
	}
	
	public static void changeVal(int num) {
		num = 10;
	}
}
