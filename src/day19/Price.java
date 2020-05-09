package day19;

public class Price {
	public static void main(String[] args) {
		// array of type double of size 3
		//                  0  ,  1  ,  2
		double[] price = {14.99, 9.99, 1.50};
		
		// double[] price = new double[3];
		// price[0] = 14.99;
		// price[1] = 9.99;
		// price[2] = 1.50;
		
		//   0       1     2
		// [14.99][9.99][1.50]
		double priceSum = price[0] + price[1] + price[2];
		System.out.println("Sum of all elements: " + priceSum);
		
//		String[] strArr = {"abc", "bca", "qwe"};
//		System.out.println();
	}
}
