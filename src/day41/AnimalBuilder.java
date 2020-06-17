package day41;

import java.util.List;

public class AnimalBuilder {
	private String name;
	private int age;
	private List<String> favoriteFood;
	
	public AnimalBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public AnimalBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	
	public AnimalBuilder setFavoriteFood(List<String> favoriteFood) {
		this.favoriteFood = favoriteFood;
		return this;
	}
	
	public Animal build() {
		return new Animal(name, age, favoriteFood);
	}
}
