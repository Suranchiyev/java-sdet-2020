package day36;

public class Lemur extends Primate {
	public void climb() {
		System.out.println("Lemur is climbing");
	}
	
	@Override
	public void run() {
		System.out.println("Lemur is running");
	}
	
	@Override
	public void eat() {
		System.out.println("Lemur is eating");
	}
	
}
