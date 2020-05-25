package day28;

import java.util.ArrayList;
import java.util.List;

public class ListReview {
	public static void main(String[] args) {
		// collection of data of same type with dynamic size
		// They hold only Objects
		
		List<Integer> listNums = new ArrayList<>();
		
		// .add(dataType) -> add element to list
		listNums.add(4);
		listNums.add(0);
		
		// remove will remove element from list
		// by index or by value 
		//listNums.remove(0);
		
		System.out.println(listNums);
		
		// gets the element by index
		// arr[0]
		System.out.println(listNums.get(0));
		
		// change existing value of element
		// arr[1] = 5;
		listNums.set(1, 5);
		System.out.println(listNums);
		
		// if value is in the list it will return true otherwise false
		System.out.println(listNums.contains(6));
		
		// make list empty
		listNums.clear();
		
		System.out.println("Is list empty: " + listNums.isEmpty());
	}
}
