package day36;

public class Eagle implements Bird{
	
	@Override
	public void fly() {
		System.out.println("Eagle is flying");
	}
	
	public void hunt() {
		System.out.println("Eagle is hunting");
	}
}
