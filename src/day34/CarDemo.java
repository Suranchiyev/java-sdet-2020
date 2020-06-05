package day34;

public class CarDemo {
	public static void main(String[] args) {
		BMW car1 = new BMW();
		car1.model = "325i";
		car1.price = 30000.0;
		car1.drive();
		
		System.out.println("-------");
		Ferrari car2 = new Ferrari();
		car2.model = "812 GTS";
		car2.price = 380000;
		car2.drive();
		car2.test();
	}
}
