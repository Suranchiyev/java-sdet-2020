package day9;

public class Restaurant {
	public static void main(String[] args) {
		// object and instance same words
		Table tableOne = new Table();
		
		System.out.println(tableOne);
		System.out.println("----------");
		
		// instance variables have default values
		//tableOne.displayDetails();
		
		tableOne.id = 1;
		tableOne.color = "black";
		tableOne.type = "4 people table";	
		tableOne.height = 50;
		tableOne.width = 200;
		tableOne.isReserved = false;
		tableOne.displayDetails();
		
		Table tableTwo = new Table();
		System.out.println("Display tableTwo:");
		//tableTwo.displayDetails();
		
		tableTwo.id = 2;
		tableTwo.color = "white";
		tableTwo.type = "6 people table";
		tableTwo.height = 50;
		tableTwo.width = 300;
		tableTwo.isReserved = true;
		tableTwo.displayDetails();
	}
}
