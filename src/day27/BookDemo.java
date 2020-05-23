package day27;

public class BookDemo {
	public static void main(String[] args) {
		Book b1 = new Book("7 Habits Of Highly Effective People", "R. Covey", 350, Rating.Excellent);
		
		Book b2 = new Book("7 Habits Of Highly Effective People", "R. Covey", 350, Rating.Excellent);
		
//		System.out.println(b1.equals(b2));
//		System.out.println(b1 == b2);
		
//		System.out.println("Title: " + b1.getTitle().equals(b2.getTitle()));
//		System.out.println("Author: " + b1.getAuthor().equals(b2.getAuthor()));
//		System.out.println("Pages: " + (b1.getPages() == b2.getPages()));
//		System.out.println("Rating: " + b1.getRating().equals(b2.getRating()));
		
		System.out.println("Books are same: " + booksEquals(b1, b2));
	}
	
	public static boolean booksEquals(Book b1, Book b2) {
		boolean isTitleEq =  b1.getTitle().equals(b2.getTitle());
		boolean isAuthorEq = b1.getAuthor().equals(b2.getAuthor());
		boolean isPages = b1.getPages() == b2.getPages();
		boolean isRatingEq = b1.getRating().equals(b2.getRating());
		
		return isTitleEq && isAuthorEq && isPages && isRatingEq;
	}
}
