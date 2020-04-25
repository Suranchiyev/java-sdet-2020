package day3;

public class Swap {
	public static void main(String args[]) {
		String sky = "yellow";
		String sun = "blue";

		String tmp = sky;
		sky = sun;
		sun = tmp;

		System.out.println("Sky is " + sky);
		System.out.println("Sun is " + sun);
	}
}