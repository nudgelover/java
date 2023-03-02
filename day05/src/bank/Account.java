package bank;

public class Account {
	private String accNum;
	private String accName;
	private double balance;

	public Account() {
//		 MakeAccountNumber makenum = new MakeAccountNumber();
//				 this.accNum = makenum.makeAccNum(); 
		this.accNum = MakeAccountNumber.makeAccNum(); // static 사용 시 이렇게 사용 가능.
		}

	public Account(String accName, double balance) {
		this();
		this.accName = accName;
		this.balance = balance;
	}

	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}

	public void withdraw(double money) {
		if (money <= 0) {
			System.out.println("금액이 잘못입력되었습니다.");
			return;
		}
		if (money > balance) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= money;

	}

	public void deposit(double money) {
		if (money <= 0) {
			System.out.println("금액이 잘못입력되었습니다.");
			return;
		}
		balance += money;

	}

	public double getBalance() {
		// 잔액조회
		return balance;
	}

}
