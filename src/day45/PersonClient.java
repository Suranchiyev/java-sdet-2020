package day45;

import java.util.Arrays;

public class PersonClient {
	public static void main(String[] args) {
		String person = "name: John, age: 7";
		
		Person perObj = new Person("John", 7);
		perObj.increaseAgeBy(10);
		
		Person perTwo = new Person();
		perTwo.name = "Alex";
		perTwo.age = 10;
		
		FileUtils.readContent("Dsesktop/test.txt");
		
		
	}
}
