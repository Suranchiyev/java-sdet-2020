package day27;

import java.util.List;

public class LibraryDemo {
	public static void main(String[] args) {
		Library lib = new Library();
		lib.setName("Gum Spring Library");
		lib.setAddress("24600 Millstream Dr");
		
		Book b1 = new Book("7 Habits Of Highly Effective People", "R. Covey", 350, Rating.Excellent);
		lib.addBook(b1);
		
		Book b2 = new Book("The 10X Rule", "G. Cardone", 250, Rating.Good);
		lib.addBook(b2);
		
		Book b3 = new Book("Educated", "T. Westover", 330, Rating.Good);
		lib.addBook(b3);
		
		System.out.println(lib.getBooks());
		
		System.out.println("Number of books in library: " + lib.getNumberOfBooks()); // 3
		
		Book book = lib.getBookByTitle("The 10X Rule"); 
		System.out.println(book.getAuthor()); // G. Cardone
		
		List<Book> goodBooks = lib.getBooksByRating(Rating.Good);
		System.out.println("Good rating books in library: " + goodBooks.size()); // 2
	
	}
}
