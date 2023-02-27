package ifcontrole;

public class Ws {

	public static void main(String[] args) {
//		1~100 까지의 숫자 중
//		1. 3의 배수 합과 평균을 구하시오
//		2. 4의 배수 합과 평균을 구하시오
//		3. 7의 배수 합과 평균을 구하시오
		int cnt=0, cnt2=0, cnt3=0, sum=0, sum2=0, sum3 = 0;
		double avg=0, avg2=0, avg3 = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
				cnt++;
			}
			if (i % 4 == 0) {
				sum2 += i;
				cnt2++;
			}

			if (i % 7 == 0) {
				sum3 += i;
				cnt3++;
			}
		}

		avg = sum / (cnt * 1.0);
		avg2 = sum2 / (cnt2 * 1.0);
		avg3 = sum3 / (cnt3 * 1.0);

		System.out.printf("3의 배수의 합은 %d,평균은%.2f 입니다\n", sum, avg);
		System.out.printf("4의 배수의 합과 평균은 %d,%.2f 입니다\n", sum2, avg2);
		System.out.printf("7의 배수의 합과 평균은 %d,%.2f 입니다\n", sum3, avg3);
	}

}
