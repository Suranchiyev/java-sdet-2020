package day41_2;

public class ZooKeeper {
	public static void main(String[] args) {
		Food food = FoodFactory.getFood("polar bear");
		food.consumed();
		
		Food food1 = FoodFactory.getFood("zebra");
		food1.consumed();
		
		// Food food2 = FoodFactory.getFood("tiger");
		// food2.consumed();
	}
}
