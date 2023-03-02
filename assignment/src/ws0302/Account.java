package ws0302;

public class Account {

//	단, 계좌 번호는 자동 생성 한다.(MakeAccountNumber 이용)
//	기능, 입금, 출금, 현재이자금액

	private String accNum;
	private String accName;
	private double balance;
	private double rate;
	private String grade;

//---------------------------------------------------------------------		
	public Account() {
		this.accNum = MakeAccountNumber.makeAccNum(); // static 사용 시 이렇게 사용 가능.
		}




	public Account(String accName, double balance, double rate, String grade) {
		this();
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}

//----------------------------------------------------------------

	public double getBalance() {
		return balance;
	}
	public String getGrade() {
		return grade;
	}

	public String getAccName() {
		return accName;
	}

//----------------------------------------------------------------------------------------------
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

	public double getInterset() {
		double result = 0.0;
		result = this.balance * this.rate;
		return result;

	}


	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + ", rate=" + rate
				+ ", grade=" + grade + "]";
	}

}
