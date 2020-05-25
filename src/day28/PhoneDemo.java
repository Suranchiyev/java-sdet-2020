package day28;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone phone1 = new Phone("Nokia", 300.00);
		System.out.println(phone1.model);
		System.out.println(phone1.price);
		
		Phone phone2 = new Phone("Iphone");		
		Phone phone3 = new Phone(100.99);
		
		Phone phone4 = new Phone();
		phone4.price = -999;
		phone4.model = "????";
		
		System.out.println(phone4.price);
		
		String str = new String("Hello");
		System.out.println(str);
		
	}
}
