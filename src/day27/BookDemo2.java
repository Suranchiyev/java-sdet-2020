package day27;

import java.util.ArrayList;
import java.util.List;

public class BookDemo2 {
	public static void main(String[] args) {
		Book b1 = new Book("7 Habits Of Highly Effective People", "R. Covey", 350, Rating.Excellent);
		
		Book b2 = new Book("7 Habits Of Highly Effective People", "R. Covey", 350, Rating.Excellent);
		
		System.out.println(b1.equals(b2));
		
		List<Book> l1 = new ArrayList<>();
		l1.add(b1);
		
		List<Book> l2 = new ArrayList<>();
		l2.add(b2);
		
		System.out.println(l1.equals(l2));
	}
}
