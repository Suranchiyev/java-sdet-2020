package day36;

public class Nokia implements Phone {
	
	@Override
	public void ring() {
		System.out.println("Nokia is ringing");
	}
	
	@Override
	public String getNumber() {
		return "7745126472";
	}
}
