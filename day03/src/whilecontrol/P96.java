package whilecontrol;

public class P96 {

	public static void main(String[] args) {
		// 짝수의 합을 구하시오
		System.out.println("start...");

		int cnt = 0;
		int i = 1;

		int sum = 0;
		double avg = 0;

//		while (i <= 100) {
//			if (i % 2 == 0) {
//				sum += i;
//				cnt++; // 이렇게 분리해야하는거 중요하다!!!!!!!!!
//			}
//			i++;
//		}

		while (i <= 10) {
			if (i % 2 == 0) {
				sum += i;
				cnt++;
			}
			if (i == 8) {
				break;
			}
			i++;

		}
		avg = (sum * 1.0) / cnt;
		System.out.printf("%d,%.2f\n", sum, avg);
		System.out.println("end...");

		// 합과 평균을 구하시오
	}

}
