package whilecontrol;

public class P92 {

	public static void main(String[] args) {
		// 합과 평균을 구하시오
		System.out.println("start...");

		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		for (int i = 1; i <= 114; i++) { // int를 안에서 선언하기에 for 구문안에서만 사용할 수 있음. while과 다른점
			sum += i;
			cnt++;

		}
		avg = sum / (cnt * 1.0);
		// 정수가 섞여있으면 닶이 정수로 나오기에 소수점 없어짐 -> cnt를 실수로 바꿔주자!
		// 물론 double cnt =0; 쓸수도 있지만 협업할 때는 그게 불가할 가능성 크기에...

		System.out.printf("%d,%.2f\n", sum, avg);

		System.out.println("end...");

		// 합과 평균을 구하시오
	}

}
