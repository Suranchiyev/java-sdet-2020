package day25;

import java.util.ArrayList;

public class Phones {
	public static void main(String[] args) {
		ArrayList<String> phones = new ArrayList<>();
		phones.add("iphone");
		phones.add("nokia");
		phones.add("hp");
		phones.add("samsung");
		
		for(int i = 0; i < phones.size(); i++) {
			System.out.println(phones.get(i));
		}
		
		phones.remove(1);
		
		System.out.println("---------");
		for(String phone : phones) {
			System.out.println(phone);
		}
	}
}
