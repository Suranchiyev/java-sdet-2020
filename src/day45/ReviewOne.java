package day45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReviewOne {
	public static void main(String[] args) {
		int i = 7;
		change(i);
		System.out.println(i); // 7
		
		Student obj = new Student();
		obj.name = "John";
		changeObj(obj);
		System.out.println(obj.name); // Alex
		
		// String is immutable, we cannot change it
		String strOne = "orange";
		changeStr(strOne);
		System.out.println(strOne);
		
		// StringBuilder mutable 
		StringBuilder sb = new StringBuilder("banana");
		changeSb(sb);
		System.out.println(sb); // banana
		
		// Arrays works same as objects
		int[] nums = {1, 3, 5, 7};
		System.out.println(Arrays.toString(nums));
		changeArr(nums);
		System.out.println(Arrays.toString(nums));
		
		// Collections also work with references
		List<String> list = new ArrayList<>();
		changeList(list);
		System.out.println(list);
	}
	
	public static void changeList(List<String> list) {
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
	}
	
	public static void changeArr(int[] arr) {
		arr[0] = 0;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 6;
	}
	
	public static void changeSb(StringBuilder sb) {
		sb.delete(0, sb.length());
		sb.append("kiwi");
		
		// sb = new StringBuilder("kiwi");
	}
	
	public static void changeStr(String str) {		
		str = "apple";
	}
	
	public static void change(int num) {
		num = 10;
	}
	
	public static void changeObj(Student student) {
		student.name = "Alex";
	}
}

class Student {
	String name;
}