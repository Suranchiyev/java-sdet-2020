package day31;

import java.util.Arrays;

public class HashTableDemo {
	public static final int HASH_MAX = 10;
	
	public static void main(String[] args) {

		
		String[] names = new String[HASH_MAX];
		
		int index = hash("John");
		names[index] = "John";
		
		index = hash("John");
		if(names[index] != null && names[index].equals("John")) {
			System.out.println("John is there");
		}
		
		index = hash("Alex");
		System.out.println("Alex: " + index);
		names[index] = "Alex";
		
		System.out.println(Arrays.toString(names));
		
		names[hash("Bob")] = "Bob";
		names[hash("Smith")] = "Smith";
		names[hash("James")] = "James";
		names[hash("Sophia")] = "Sophia";
		System.out.println(Arrays.toString(names));
		
		String name = "Ilya";
		if(names[hash(name)] != null && names[hash(name)].equals(name)) {
			System.out.println(name + " is there");
		}else {
			System.out.println(name + " is not there!");
		}
		
		System.out.println("-----------");
		
		index = hash("Kuzzat");
		System.out.println("Kuzzat: " + index);
		System.out.println("John: " + hash("John"));
		System.out.println(Arrays.toString(names));
		
		names[index] = "Kuzzat";
		System.out.println(Arrays.toString(names));
	}
	
	public static int hash(String str) {
		int code = 0;
		
		for(int i = 0; i < str.length(); i++) {
			code += str.charAt(i);
		}
		
		return code % HASH_MAX;
	}
}
