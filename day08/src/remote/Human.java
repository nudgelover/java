package remote;

public class Human {

	public static void main(String[] args) {
		
		
		//Remote remote = null;
		//이 null 값에 뭐가 들어갔는지에 따라 turnon/off 할 수 있다.
		
		Remote remote =  new Tv(); 
		// 이 tv를 audio랑 왔다갔다하는 건 스프링에서 할 것이다.
		remote.turnOn();
		remote.turnOff();
		
//		Remote remote =  new Audio(); 
//		remote.turnOn();
//		remote.turnOff();
		

	}

}
