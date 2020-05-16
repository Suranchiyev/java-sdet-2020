package day23;

public class MethodsEnum {
	enum Env {DEV, TEST, ACPT, PROD};
	
	public static String getEnvironment(Env environment) {
		switch(environment) {
		case DEV:
			return "https://www.dev-google.com";
		case TEST:	
			return "https://www.test-google.com";
		case ACPT:
			return "https://www.acpt-google.com";
		case PROD:
			return "https://www.google.com";	
		}
		return "";
	}
	
	public static String getEnvStr(String environment) {
		switch(environment) {
		case "DEV":
			return "https://www.dev-google.com";
		case "TEST":	
			return "https://www.test-google.com";
		case "ACPT":
			return "https://www.acpt-google.com";
		case "PROD":
			return "https://www.google.com";
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		
		String url = getEnvironment(Env.DEV);
		System.out.println("URL: " + url);
		
		url = getEnvStr("DEV1");
		System.out.println("URL: " + url);
		
		// Environment env = Environment.ACPT;
		
	}
	
}
