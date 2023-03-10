package com.kbstar.dto;



public class AccountDTO {
	private String accNO;
	private double balance;
	private String holder;

	public AccountDTO() {
	}

	public AccountDTO(String accNO, double balance, String holder) throws Exception {
		this.accNO = accNO;
		if (balance < 0) {
			throw new Exception("음수입력");
		} else {
			this.balance = balance;
		}
		this.holder = holder;
	}

	public String getAccNO() {
		return accNO;
	}

	public void setAccNO(String accNO) {
		this.accNO = accNO;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	@Override
	public String toString() {
		return "AccountDTO [accNO=" + accNO + ", balance=" + balance + ", holder=" + holder + "]";
	}

}
