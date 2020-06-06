package day35;

public abstract class Animal {
	public String type;
	
	public void getDetails() {
		System.out.println("Animal: " + type);
	}
	
	public abstract void run();
	public abstract void eat();
}
