package day44;

public class Person {
	public String name;
	public int age;
	public static String address;
	
	public static void main(String[] args) {
		Person john = new Person();
		john.name = "John";
		john.age = 35;
		john.address = "101 Main st";
		
		System.out.println(john.name);
		System.out.println(john.age);
		System.out.println(john.address);
		System.out.println("---------");
		
		Person smith = new Person();
		System.out.println(smith.name); 
		System.out.println(smith.age);
		System.out.println(smith.address); // 101 Main st
		
		smith.address = "136 Locus St";
		System.out.println("---------");
		
		System.out.println(john.name);   // John
		System.out.println(john.age);    // 35
		System.out.println(john.address);// 136 Locus St
		
		System.out.println("--------");
		Person alex = new Person();
		System.out.println(alex.name);    // null
		System.out.println(alex.age);     // 0
		System.out.println(alex.address); // 136 Locus St
		
		alex.address = "25 North St";
		System.out.println(alex.address);
		System.out.println(smith.address);
		System.out.println(john.address);
	}
}
