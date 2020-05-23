package day27;

public class CatDemo {
	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.setName("Murka");
		obj.setAge(3);
		obj.setSecondName("M");
		
		Cat obj2 = new Cat("Tom", 4);
		System.out.println(obj2.getName());
		System.out.println(obj2.getAge());
		
		System.out.println("------");
		System.out.println(obj.getName());
		System.out.println(obj2.getName());
		
		Cat obj3 = new Cat();
	}
}
