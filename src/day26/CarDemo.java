package day26;

public class CarDemo {
	public static void main(String[] args) {
		Car obj = new Car();
		// ClassName name = new ClassName();
		System.out.println(obj.model); // null
		System.out.println(obj.color); // null
		System.out.println(obj.price); // 0.0
		
		System.out.println("--------");
		
		Car obj1 = new Car();
		System.out.println(obj1.model);
		System.out.println(obj1.color);
		System.out.println(obj1.price);
		System.out.println("----------");
		
		Car obj2 = new Car();
		obj2.model = "Audi Q7";
		obj2.color = "red";
		obj2.price = 59000.99;
		
		System.out.println(obj2.model);
		System.out.println(obj2.color);
		System.out.println(obj2.price);
		
	}
}
