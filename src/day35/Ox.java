package day35;

public class Ox extends Mammal {	
	@Override
	public void run() {
		System.out.println("Ox is running");
	}
	
	@Override
	public void eat() {
		System.out.println("Ox is eating");
	}
	
	@Override
	public void drinkMilk() {
		System.out.println("drinking..");
	}
	
}
