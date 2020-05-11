package day20;
import java.util.Arrays;

public class SwapValues {
	public static void main(String[] args) {
		
		String[] city = {"Aldie", "Arlington", "Tysons", "Chantilly", "DC"};
		System.out.println(Arrays.toString(city));
		
		// swap values of first and last element of the array city
		
		// [Aldie, Arlington, Tysons, Chantilly, DC]
		// [DC, Arlington, Tysons, Chantilly, Aldie]
		
		String tempVar = city[0];
		city[0] = city[city.length - 1];
		city[city.length - 1] = tempVar;
		
		System.out.println(Arrays.toString(city));
	}
}
