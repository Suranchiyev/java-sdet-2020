package day12;

public class Terminal {
	private static final boolean isWindows = System.getProperty("os.name").toLowerCase().contains("windows");
	
	public static void main(String[] args) {
		// boolean isWindows = true;
		
		String terminalToUse = isWindows ? "GitBush Terminal" : "Regular Terminal";
		System.out.println(terminalToUse);
		
		String message = System.getProperty("os.name");
		System.out.println(message);
	}
}
