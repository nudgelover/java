package array;

import java.util.Arrays;
import java.util.Random;

public class P105 {

	public static void main(String[] args) {
		int arr[] = new int[5];

		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(9) + 1;
		}
		System.out.println(Arrays.toString(arr));

		// 배열의 합과 평균을 구하시오.
		// 홀수 번째의 합과 평균을 구하시오.

		int sum = 0;
		double avg = 0.00;
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) { //홀수 번째 인데 ==0인 이유!, arr index가 0부터 시작하기에..!! 헷갈리니 항상 테스트를 해보자
				sum += arr[i];
				cnt++;

			}
		}
		avg = sum / (cnt * 1.0);
		System.out.printf("홀수번째의 합계는 %d 평균은 %.2f 입니다", sum, avg);
	}

}
