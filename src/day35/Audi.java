package day35;

public class Audi extends Car {
	
	@Override
	public void drive() {
		System.out.println("Audi is driving.");
	}
	
	@Override
	public void stop() {
		System.out.println("Audi is stopped.");
	}
	
	@Override
	public double getSpeed() {
		return speed;
	}
}
