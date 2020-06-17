package day41;

import java.util.Arrays;

public class AnimalDemo {
	public static void main(String[] args) {
		// Created object from immutable Animal
		Animal animal = new Animal("Tiger", 3, Arrays.asList("deer", "goat"));
		System.out.println(animal);
		
	    // in order to modify the immutable objects you need to create another object	
		Animal animal1 = new Animal(animal.getName(), animal.getAge() + 2, animal.getFavoriteFoods());
		System.out.println(animal1);
		
		System.out.println("-----------");
		
		// String is immutable
		String str = "hello";
		String str1 = str + ", world!";
		System.out.println(str1);
		
		// StringBuilder is mutable
		StringBuilder sb = new StringBuilder("hello");
		sb.append(", world!");
		System.out.println(sb);
	}
}
