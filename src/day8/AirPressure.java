package day8;

public class AirPressure {
	public static void main(String[] args) {
		// create a method to calculate air pressure message
		// if pressure is from 13.5 to 15.5 then it's "normal pressure"
		// if pressure is less then 13.5 then it's "low pressure"
		// if pressure is greater then 15.5 then it's "high pressure"
		
		double pressure = 14.5;
		
		// pressure >= 13.5 and pressure <= 15.5
		if(pressure >= 13.5 && pressure <= 15.5) {
			System.out.println("normal pressure");
		}
		
		if(pressure < 13.5) {
			System.out.println("low pressure");
		}
		
		if(pressure > 15.5) {
			System.out.println("high pressure");
		}
	}
}
