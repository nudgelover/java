package bank;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 계좌 생성
		// 계좌 생성 조회
		// 계좌 입금
		// 계좌 출금

		Scanner sc = new Scanner(System.in);
		Account acc = null;

		while (true) {
			System.out.println("Input Command(c,w,d,q)..");
			String cmd = sc.next();

			if (cmd.equals("q")) {
				System.out.println("감사합니다. 안녕히가십시오.");
				break;

			} else if (cmd.equals("c")) {
				System.out.println("계좌 생성을 도와드리겠습니다.");
				System.out.println("원하시는 계좌종류(입출금/적금/예금), 예금주 성명, 입금금액을 입력해주십시오.");
				System.out.println("원하시는 계좌종류(입출금/적금/예금)를 적어주십시오.");
				String name = sc.next();
				System.out.println("예금주의 성명을 적어주십시오.");
				String accHolder = sc.next();
				System.out.println("입금하실 금액을 입력해주십시오.");
				double balance = 0.0;

				try {
					balance = Double.parseDouble(sc.next());
					acc = new Account(name, accHolder, balance);
					System.out.println(acc);

				} catch (NumberFormatException e) {
					System.out.println("숫자가 입력되지 않았습니다. 다시입력해주세요.");

				} catch (MinusException e) {
					System.out.println("음수값이 입력되었습니다. 다시 입력해주세요.");

				}

			} else if (cmd.equals("w")) {
				System.out.println("Withdraw:");
				System.out.println("얼마를 출금하시겠습니까?");

				double money = 0.0;
				try {
					money = Double.parseDouble(sc.next());
					acc.withdraw(money);
					System.out.println("잔액은 " + acc.getBalance() + "입니다.");
				} catch (MinusException e) {
					System.out.println("음수값이 입력되었습니다. 다시 입력해주세요.");
				} catch (InsufficientBalanceException e) {
					System.out.println("잔액을 초과하였습니다. 잔액은" + acc.getBalance() + "입니다.");
				} catch (NumberFormatException e) {
					System.out.println("숫자가 입력되지 않았습니다. 다시입력해주세요.");
				}

			} else if (cmd.equals("d")) {
				System.out.println("Deposit:");
				System.out.println("얼마를 입금하시겠습니까?");
				double money = 0.0;
				try {
					money = Double.parseDouble(sc.next());
					acc.deposit(money);
					System.out.println("잔액은 " + acc.getBalance() + "입니다.");
				} catch (MinusException e) {
					System.out.println("음수값이 입력되었습니다. 다시 입력해주세요.");
				} catch (NumberFormatException e) {
					System.out.println("숫자가 입력되지 않았습니다. 다시입력해주세요.");
				}

			}

		}
		sc.close();
	}

}
