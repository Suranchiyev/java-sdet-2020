package day27;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private String name;
	private String address;
	// [B][B][B]
	private List<Book> books;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBooks() {
		if(books == null) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < books.size(); i++) {
			sb.append((i+1) + ". " + books.get(i).getTitle()+"\n");
		}
		
		return sb.toString();
	}
	
	public void addBook(Book book) {
		if(books == null) {
			books = new ArrayList<>();
		}
		
		books.add(book);
	}
	
	public int getNumberOfBooks() {
		return books.size();
	}
	
	public Book getBookByTitle(String title) {
		// Loop over books list
		// compare titles if titles are equal
		// return that book element
		
		// [B][B][B]
//		for(Book book : books) {
//			if(book.getTitle().equals(title)) {
//				return book;
//			}
//		}
		
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getTitle().equals(title)) {
				return books.get(i);
			}
		}
		
		return null;
	}
	
	public List<Book> getBooksByRating(Rating rating) {
		// Create new list of type Book
		// loop over the books list
		// if rating is same as provided rating
		// add to created list
		// return that list
		
		List<Book> resBooks = new ArrayList<>();
		
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getRating().equals(rating)) {
				resBooks.add(books.get(i));
			}
		}
		
		return resBooks;
	}
}
