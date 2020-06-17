package day41;

import java.util.ArrayList;
import java.util.List;

public final class Animal {
	private final String name;
	private final int age;
	private final List<String> favoriteFoods;
	
	public Animal(String name, int age, List<String> favoriteFood) {
		this.name = name;
		this.age = age;
		
		if(favoriteFood != null) {
			// assign copy of list that comes from method argument
			this.favoriteFoods = new ArrayList<>(favoriteFood);
		}else {
			this.favoriteFoods = null;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public List<String> getFavoriteFoods() {
		// return copy of favoriteFoods
		return new ArrayList<>(favoriteFoods);
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", favoriteFoods=" + favoriteFoods + "]";
	}
	
	
}
