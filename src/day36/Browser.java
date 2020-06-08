package day36;

public interface Browser {
	/*
    - open()
	- goTo(String url)
	- click(String on)
	- navigateForward()
	- navigaetBack()
	- close()
	- getBrowserName()
	*/
	
	public abstract void open();
	
	public abstract void goTo(String url);
	
	public abstract void click(String on);
	
	public abstract void navigateForward();
	
	public abstract void navigateBack();
	
	public abstract void close();
	
	public abstract String getBrowserName();
	
}
