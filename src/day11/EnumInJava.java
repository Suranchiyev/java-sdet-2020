package day11;

public class EnumInJava {
	enum Country {USA, Canada, UK, Brazil, Russia};
	
	
	public static void main(String[] args) {
		
		double price = getFeeByCountry(Country.USA);
		System.out.println(price);
		
		System.out.println(getFeeByCountry(Country.Canada));
		System.out.println(getFeeByCountry(Country.Brazil));
		System.out.println(getFeeByCountry(Country.UK));
		
//		Country myCountry = Country.USA;
//		System.out.println(myCountry);	
	}
	
	// USA, Canada, UK, Brazil
	public static double getFeeByCountry(Country country) {
		if(country.equals(Country.USA)) {
			return 10.00;
		}else if(country.equals(Country.Canada)) {
			return 12.00;
		}else if(country.equals(Country.UK)) {
			return 9.00;
		}else if(country.equals(Country.Russia)) {
			return 9.00;
		}else {
			// default else for Brazil
			return 8.00;
		}
	}
}
