package day15;

public class PyramidReverse {
	public static void main(String[] args) {
		//                01234567891011
		String pyramid = "############";
		
		/* ############
		 * ###########
		 * ##########
		 * #########
		 * ########
		 * #######
		 * ######
		 * #####
		 * ####
		 * ###
		 * ##
		 * #
		 */
		
//		 System.out.println(pyramid.substring(0, pyramid.length() - 0));
//		 System.out.println(pyramid.substring(0, pyramid.length() - 1));
//		 System.out.println(pyramid.substring(0, pyramid.length() - 2));
//		 System.out.println(pyramid.substring(0, pyramid.length() - 3));
//		 System.out.println(pyramid.substring(0, pyramid.length() - 4));
//		 System.out.println(pyramid.substring(0, pyramid.length() - 5));
		 
		 for(int i = 0; i < pyramid.length(); i++) {
			 System.out.println(pyramid.substring(0, pyramid.length() - i));
		 }
	}
}
