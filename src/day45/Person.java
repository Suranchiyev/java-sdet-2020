package day45;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {}
	
	public void increaseAgeBy(int by) {
		age = age + by;
	}
	
	public String nameAsUpperCase() {
		return name.toUpperCase();
	}
}
