package day35;

public class BMW extends Car{
	// implement - override
	
	@Override
	public void drive() {
		System.out.println("BMW is driving");
	}
	
	@Override
	public void stop() {
		System.out.println("BMW is stopped");
	}
	
	@Override
	public double getSpeed() {
		return speed;
	}
}
