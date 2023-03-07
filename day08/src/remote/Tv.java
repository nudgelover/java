package remote;

public class Tv implements Remote{

	@Override
	public void turnOn() {
		System.out.println("Turn on TV");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off TV");
		
	}

}
