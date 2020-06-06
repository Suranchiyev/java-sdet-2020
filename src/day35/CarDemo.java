package day35;

public class CarDemo {
	public static void main(String[] args) {
		// Car car = new Car(); we cannot create object from abstract
		// class directly
		
		Audi car = new Audi();
		car.drive();
		car.stop();
		car.getSpeed();
		
		Car car1 = new Audi();
		car1.drive();
		car1.stop();
		car1.getSpeed();
	}
}
