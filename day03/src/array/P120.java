package array;

public class P120 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		double avg = 0.0;

		for (int data : a) {
			sum += data;
		}

		avg = sum / (a.length * 1.0);

		System.out.printf("합은 %d 평균은 %.2f", sum, avg);
	}
}
