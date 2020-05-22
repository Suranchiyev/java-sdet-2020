package day26;

public class CarDemo2 {
	public static void main(String[] args) {
		 Car car = new Car();
		 
		 Car car1 = new Car("BMW");
		 System.out.println(car1.model);
		 
		 System.out.println("---------");
		 
		 Car car2 = new Car("Honda", "Silver", 23000.0);
		 System.out.println(car2.model);
		 System.out.println(car2.color);
		 System.out.println(car2.price);
		 
		 Car car3 = new Car("Mazda", "white", 25000.0);
		 // car3.price = -9999; 
		 System.out.println(car3.model);
		 System.out.println(car3.color);
		 System.out.println(car3.price);
	}
}
