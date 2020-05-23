package day27;

import java.util.ArrayList;
import java.util.List;

public class BookDemo1 {
	public static void main(String[] args) {
		// ["apple"]["banana"]
		List<String> list1 = new ArrayList<>();
		list1.add("apple");
		list1.add("banana");
		
		// ["apple"]["banana"]
		List<String> list2 = new ArrayList<>();
		list2.add("apples");
		list2.add("banana");
		
		System.out.println(list1.equals(list2));
		
		
		List<Book> bookList1 = new ArrayList<>();
		
		Book b1 =  new Book("7 Habits Of Highly Effective People", "R. Covey", 350, Rating.Excellent);
		bookList1.add(b1);
		
		Book b2 = new Book("The 10X Rule", "G. Cardone", 250, Rating.Good);
		bookList1.add(b2);
		
		for(Book book : bookList1) {
			System.out.println(book.getTitle() + ", " + book.getAuthor());
		}
		
		
		List<Book> bookList2 = new ArrayList<>();
		
		Book b3 =  new Book("7 Habits Of Highly Effective People", "R. Covey", 350, Rating.Excellent);
		bookList2.add(b3);
		
		Book b4 = new Book("The 10X Rule", "G. Cardone", 250, Rating.Good);
		bookList2.add(b4);
		
		// System.out.println(bookList1.equals(bookList2));
		System.out.println("Lists of Book are same: " + listBookEquals(bookList1, bookList2));
	}
	
	public static boolean listBookEquals(List<Book> list1, List<Book> list2) {
		if(list1.size() != list2.size()) {
			return false;
		}
		
		for(int i = 0; i < list1.size(); i++) {
			if(!booksEquals(list1.get(i), list2.get(i))) {
				return false;
			} 
		}
		
		return true;
	}
	
	public static boolean booksEquals(Book b1, Book b2) {
		boolean isTitleEq =  b1.getTitle().equals(b2.getTitle());
		boolean isAuthorEq = b1.getAuthor().equals(b2.getAuthor());
		boolean isPages = b1.getPages() == b2.getPages();
		boolean isRatingEq = b1.getRating().equals(b2.getRating());
		
		return isTitleEq && isAuthorEq && isPages && isRatingEq;
	}
}
