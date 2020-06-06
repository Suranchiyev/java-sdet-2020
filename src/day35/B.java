package day35;

public class B extends A {
	
	@Override
	public int getNum(int num) {
		return num * num;
	}
	
	
	public static void main(String[] args) {
		B obj = new B();
		obj.print();
		
		obj.getNum(2);
	}
}
