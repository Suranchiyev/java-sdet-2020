package day41_2;

public class FoodFactory {
	
	public static Food getFood(String animalName) {	
		
		switch(animalName) {
		case "zebra":
			return new Hay(100);
			
		case "rabbit":
			return new Pellets(5);
			
		case "goat":
			return new Pellets(30);
			
		case "polar bear":
			return new Fish(10);
			
		case "flamingo":
			return new Fish(1);
			
		default:
			throw new IllegalArgumentException("Unsupported animal: " + animalName);
		}
	}
	
}
