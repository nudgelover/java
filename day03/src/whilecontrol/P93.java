package whilecontrol;

public class P93 {

	public static void main(String[] args) {
		// 합과 평균을 구하시오
		System.out.println("start...");

		int i = 1;
		int sum = 0;
		double avg = 0;

		while (i <= 100) {
			sum += i; // 순서 주의!!!
			i++;	
		}
		avg = (sum*1.0) / (i -1);
		System.out.printf("%d,%.2f\n", sum, avg);
		System.out.println("end...");

		// 합과 평균을 구하시오
	}

}
