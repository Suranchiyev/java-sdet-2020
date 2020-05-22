package day26;

public class BookDemo {
	public static void main(String[] args) {
		Book oca = new Book("OCA");
		System.out.println(oca.title); // OCA
		
		Book ocp = new Book("OCP", 500);
		System.out.println(ocp.title); // OCP
		System.out.println(ocp.numberOfPages); // 500
		
		Book obj = new Book();
		
	}
}
