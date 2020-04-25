package day3;

public class MilkAndJuce {
	public static void main(String args[]) {
		String milk = "juce";
		String juce = "milk";

		String tmp;
	// juce
		tmp = milk;

	// milke
		milk = juce;

	// juce
		juce = tmp;

		// milk = "milk"; direct assiment not allowed here
		// TODO swap the values of milk and juce

		System.out.println("Milk: " + milk);
		System.out.println("Juce: " + juce);
	}
}