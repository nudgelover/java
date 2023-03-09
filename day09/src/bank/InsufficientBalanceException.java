package bank;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException() {

	}

	public InsufficientBalanceException(String msgcode) {
		super(msgcode);
	}


}
