package bank;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		
		while (true) {
			System.out.println("Input Command(c,w,d,s,q)..");
			String cmd = sc.next();
			
			if (cmd.equals("q")) {
				System.out.println("Bye...");
				break;
				
			} else if (cmd.equals("c")) {
				System.out.println("Create Account:");
				System.out.println("Input Account info[name,balance]");

				System.out.println("Input Name");
				String name = sc.next();
				System.out.println("Input Balance");
				double balance = Double.parseDouble(sc.next());

				// Account acc = new Account(name,balance);여기에 이렇게 선언하면 여길 벗어난 공간에서 초기화 되기에 못씀!
				// while 밖에서 선언!
				acc = new Account(name, balance);
				System.out.println(acc);

			} else if (cmd.equals("w")) {
				System.out.println("Withdraw:");
				System.out.println("얼마를 출금하시겠습니까?");
				double  money = sc.nextDouble();
				//double money = double.parseDouble(sc.next());
				acc.withdraw(money);
				System.out.println("잔액은 "+acc.getBalance()+"입니다.");
				
			} else if (cmd.equals("d")) {
				System.out.println("Deposit:");
				System.out.println("얼마를 입금하시겠습니까?");
				double  money = sc.nextDouble();
				acc.deposit(money);
				System.out.println("잔액은 "+acc.getBalance()+"입니다.");
				
			} else if (cmd.equals("s")) {
				System.out.println("Select:");
				System.out.println(acc);
			}

		}
		sc.close();

	}

}
