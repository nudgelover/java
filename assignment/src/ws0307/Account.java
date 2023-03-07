package ws0307;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;

	public Account() {
		this.accNo = MakeAccountNumber.makeAccNum();
	}

	public Account(String name, String accHolder, double balance) throws MinusException {
		this();
		this.name = name;
		this.accHolder = accHolder;
		if (balance < 0) {
			throw new MinusException("음수 값 입력 금지");
		} else {
			this.balance = balance;
		}
	}

	public Account(String accNo, String name, String accHolder, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}

	public void withdraw(double money) throws MinusException, InsufficientBalanceException {
		if (money <= 0) {
			throw new MinusException("음수 값 입력 금지");

		}
		if (money > balance) {
			throw new InsufficientBalanceException("잔액 부족");
		}
		balance -= money;

	}

	public void deposit(double money) throws MinusException {
		if (money <= 0) {
			throw new MinusException("음수 값 입력 금지");
		}
		balance += money;

	}

	public double getBalance() {
		// 잔액조회
		return balance;
	}

	// Constructor - 음수 예외 상황

	// 계좌 정보 조회
	// 잔액조회
	// 입금 - 음수 예외 상황
	// 출금 - 잔액 부족 예외 상황. 음수 예외 상황

}
