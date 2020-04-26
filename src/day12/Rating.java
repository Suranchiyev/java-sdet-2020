package day12;

public class Rating {
	enum MovieRating {EXCELLENT, AVERAGE, BAD};
	
	public static void main(String[] args) {		
		String message = getRatingMessage(MovieRating.EXCELLENT);
		System.out.println(message);
	}
	
	public static String getRatingMessage(MovieRating rating) {
		String message;
		
		switch(rating) {
		case EXCELLENT:
			message = "You must see this movie!";
			break;
		case AVERAGE:
			message = "This movie is OK, but not great.";
			break;
		case BAD:
			message = "Skip it!";
			break;
		default:
			message = "Something is wrong";
			break;
		}
		
		return message;
	}
}
