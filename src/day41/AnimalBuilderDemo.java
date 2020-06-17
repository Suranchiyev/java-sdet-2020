package day41;

import java.util.Arrays;

public class AnimalBuilderDemo {
	public static void main(String[] args) {
		//Animal animal = new Animal("Cat", 0, null, null null null null null null);
		//Animal animal0 = new Animal("Cat");
		
		AnimalBuilder aBuilder = new AnimalBuilder();
		aBuilder.setName("Cat").setAge(2);
		Animal animal = aBuilder.build();
		System.out.println(animal);
		
		
		Animal animal2 = new AnimalBuilder().setName("dog").setAge(4).build();
		System.out.println(animal2);
		
		Animal animal3 = new AnimalBuilder().setName("flamingo").setFavoriteFood(Arrays.asList("fish", "sugar")).build();
	}
}
