package day31_2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInterview {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		
		// TODO
		// Loop over the list
		// Use % to find if element is even or odd
		// if element is even add to evenList otherwise add to oddList
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				evenList.add(list.get(i));
			}else {
				oddList.add(list.get(i));
			}
		}
		
		System.out.println(evenList); // [2, 4, 6]
		System.out.println(oddList);  // [1, 3, 5]
	}
}
