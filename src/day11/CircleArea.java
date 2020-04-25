package day11;
import java.util.Scanner;

public class CircleArea {
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		//double pi = 3.14159; // we gonna use constant PI
		double radius;
		double area;
				
		//PI = 4.14; // We cannot change the value of final variables
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of a circle: ");
		radius = sc.nextDouble();
		area = PI * (radius * radius);
		
		System.out.println("A circle of radius " + radius);
		System.out.println("has an area of " + area);
	}
}
