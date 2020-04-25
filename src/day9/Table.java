package day9;

public class Table {
	public long id;
	public String color;
	public String type;
	public int height;
	public int width;
	public boolean isReserved;
	
	public void displayDetails() {
		System.out.println("Tabe ID: " + id);
		System.out.println(color);
		System.out.println(type);
		System.out.println(height);
		System.out.println(width);
		System.out.println(isReserved);
		System.out.println("-----------");
	}
}
