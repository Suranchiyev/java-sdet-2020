package day19;

public class Temperature {
	public static void main(String[] args) {
		
		double[] temp = new double[]{ 32, 30, 25.7, 26, 34, 31.5 , 29};
		// [32]	[30] [25.7] [26] [34] [31.5] [29]
		
		// find out sum of each elements
		double sum = 0.0;
		
		// find out average tem from array
		double averageTemp = 0.0;
		
		//  0     1    2     3    4     5     6
		// [32]	[30] [25.7] [26] [34] [31.5] [29]
		for(int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		
		System.out.println("Sum is " + sum); // 0
		
		averageTemp = sum / temp.length;
		System.out.println("The average temp is " + averageTemp);
		
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] > averageTemp) {
				System.out.println(temp[i] + " above average");
			}else if(temp[i] < averageTemp) {
				System.out.println(temp[i] + " below average");
			}else {
				System.out.println(temp[i] + " average");
			}
		}
	}
}
