package day8;

import day9.Car;

public class Cat {
	public String name;
	public int age;
	
	public static void main(String[] args) {
		Car car = new Car();
		car.model = "audi";
		car.drive();
		
		//car.turnLeft();
		//car.name = "Q6";
		//car.year = 2020;
		//car.price = 39000.99;
	}
}
