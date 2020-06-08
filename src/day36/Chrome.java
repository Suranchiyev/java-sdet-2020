package day36;

public class Chrome implements Browser {
	
	@Override
	public void open() {
		System.out.println("Open browser in Chrome");
		//..
	}
	
	@Override
	public void goTo(String url) {
		System.out.println("Open page: " + url);
		//..
	}
	
	@Override
	public void click(String on) {
		System.out.println("Click: " + on);
		//..
	}

	@Override
	public void navigateForward() {
		System.out.println("Navigate forward");
	}

	@Override
	public void navigateBack() {
		System.out.println("Navigate back");
	}

	@Override
	public void close() {
		System.out.println("Close");
	}

	@Override
	public String getBrowserName() {
		return "Chrome";
	}
	
	
}
