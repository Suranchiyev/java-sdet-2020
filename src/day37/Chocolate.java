package day37;

public class Chocolate {
	public static String ch1;
	public String ch2;
	
	static {
		System.out.println("inside static block");
	}
	
	{
		System.out.println("inside initializer block");
	}
	
	public Chocolate() {
		System.out.println("inside constractor");
	}
}
