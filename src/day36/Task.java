package day36;

public class Task {
	public static void main(String[] args) {
		Browser browser = getBrowser("chrome");
		printBrowserType(browser);
	
		browser.open();
		browser.goTo("https://google.com");
		browser.click("Search filed");
		browser.navigateForward();
		// ..
		// 300 lines
		// ..
		browser.close();
	}
	
	public static void printBrowserType(Browser browser) {
		if(browser instanceof Chrome) {
			System.out.println("--- Task on Chrome ---");
		}else if(browser instanceof Firefox) {
			System.out.println("--- Task on Firefox ---");
		}else {
			System.out.println("--- undefined ---");
		}
	}
	
	public static Browser getBrowser(String browser) {
		browser = browser.toLowerCase();
		switch(browser) {
		case "chrome":
			return new Chrome();
		case "firefox":
			return new Firefox();
		default:
			return new Chrome();
		}
	}
}
