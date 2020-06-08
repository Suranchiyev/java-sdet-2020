package day36;

public class ZooWorker {
	public static void main(String[] args) {
		Reptile r = new Reptile();
		feed(r);
		
		Crocodile c = new Crocodile();
		feed(c);
		
		Alligator a = new Alligator();
		feed(a);
	}
	
	public static void feed(Reptile reptile) {
		System.out.println("Feeding " + reptile.getName());
	}
}
