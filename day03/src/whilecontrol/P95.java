package whilecontrol;

public class P95 {

	public static void main(String[] args) {
		// 짝수의 합과 평균을 구하시오.
		System.out.println("start...");

		int sum = 0;
		int cnt = 0;
		double avg = 0.0;

//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				sum += i;
//				cnt++;
//			}
//
//		}

//
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				continue;
//			}
//			sum += i;
//			cnt++;
//		}
//	

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
				cnt++;
			}
			if (i == 8) {
				break;
			}

		}

		avg = sum / (cnt * 1.0);

		System.out.printf("%d,%.2f\n", sum, avg);

		System.out.println("end...");

	}

}
