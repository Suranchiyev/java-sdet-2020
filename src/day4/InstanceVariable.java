package day4;

public class InstanceVariable {
	private String name = "John";
	private int age = 65;
	private String city = "Aldie";
	public String street = "101 Main St";

	public static void main(String[] args) {
		// it will not compile because we cannot use non static member(variables) inside static method
		//name = "Smith";

		// creating an object from InstanceVariable class to use it's instance variables
		InstanceVariable obj = new InstanceVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.city);
		System.out.println(obj.street);

		obj.name = "Smith";
	}

	public void doSomething(){
		name = "Smith";
	}
}
