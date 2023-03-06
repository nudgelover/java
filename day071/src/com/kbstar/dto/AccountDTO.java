package com.kbstar.dto;

public class AccountDTO {
	private String accNum;
	private String accName;
	private double balance;

	public AccountDTO() {
	}


	public AccountDTO(String accNum, String accName, double balance) {
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
