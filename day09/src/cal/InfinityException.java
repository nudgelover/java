package cal;

public class InfinityException extends Exception {
	//모든 Exception은 상속을 받아야 처리가 되기에 직접 상속을 처리해주자!
	
	public InfinityException() {
		
	}
	
	public InfinityException(String msgcode) {
		super(msgcode);
	}
		
	

}
