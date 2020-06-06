package day35;

public class Child extends Parent {
	@Override
	public void run() {
		System.out.println("Child class is running");
	}
	
	@Override
	public String getDetails() {
		return "Child class";
	}
}
