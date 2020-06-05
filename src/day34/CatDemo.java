package day34;

public class CatDemo {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.name = "Barsik";
		
		Cat cat2 = new Cat();
		cat2.name = "Barsik";
		
		System.out.println(cat1.equals(cat2));
	}
}
