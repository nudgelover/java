package ws0302;

public class App {

	public static void main(String[] args) {

		Account acc[] = new Account[6];
		double all_account_balance_sum = 0.0;
		double all_account_balance_avg = 0.0;
		double vip_account_balance_sum = 0.0;
		double vip_account_balance_avg = 0.0;
		int cnt = 0;

		acc[0] = new Account("james1", 10000, 0.35, "VIP");
		acc[1] = new Account("james2", 10000, 0.45, "GOLD");
		acc[2] = new Account("james3", 10000, 0.55, "SIVER");
		acc[3] = new Account("james4", 10000, 0.15, "GOLD");
		acc[4] = new Account("james5", 10000, 0.28, "SIVER");
		acc[5] = new Account("james6", 10000, 0.31, "VIP");

		System.out.println("계좌정보를 출력합니다. ");
		for (Account data : acc) {
			System.out.println(data);
		}

		for (int i = 0; i < acc.length; i++) {
			System.out.printf("%s 님의 계좌의 잔액은 %.0f 원, 현재 이자금액은 %.0f 원 입니다.\n", acc[i].getAccName(), acc[i].getBalance(),
					acc[i].getInterset());
		}

		System.out.println("모든 고객의 잔액의 합과 평균을 출력합니다. ");

		for (Account data : acc) {
			all_account_balance_sum += data.getBalance();
		}

		all_account_balance_avg = all_account_balance_sum / (acc.length * 1.0);
		System.out.printf("모든 고객의 잔액 합계는 %.0f원 평균은 %.2f입니다. \n", all_account_balance_sum, all_account_balance_avg);

		System.out.println("VIP고객의 명단은 다음과 같습니다");
		for (Account data : acc) {
			if (data.getGrade().equals("VIP")) {
				System.out.println(data.getAccName());
			}
		}
		System.out.println("VIP 잔액의 합과 평균을 출력합니다. ");
		for (Account data : acc) {
			if (data.getGrade().equals("VIP")) {
				vip_account_balance_sum += data.getBalance();
				cnt++;
			}
		}

		vip_account_balance_avg = vip_account_balance_sum / (cnt * 1.0);
		System.out.printf("VIP 잔액 합계는 %.0f 평균은 %.2f 입니다", vip_account_balance_sum, vip_account_balance_avg);

	}

}
