package bank;

public class InsufficientBalanceException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException() {

	}

	public InsufficientBalanceException(String msgcode) {
		super(msgcode);
	}


}
