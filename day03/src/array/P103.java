package array;

import java.util.Arrays;
import java.util.Random;

public class P103 {

	public static void main(String[] args) {

// 		int arr[] = new int[3]; 또는,
//		int[] arr = new int[3]; 또는,
//		int arr[] = { 10, 20, 30 }; 

		int arr[] = new int[10];

// 		배열에 랜덤 값을 넣어보자

		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
//			int data = r.nextInt(99) + 1;
//			arr[i] = data; 이걸 합쳐서! 
			arr[i] = r.nextInt(99) + 1;
		}

		System.out.println(Arrays.toString(arr));

//		배열의 합과 평균을 구하시오.
		int sum = 0;
		double avg = 0.0;

		for (int a : arr) {
			sum += a;
		}

		avg = sum / (arr.length * 1.0); // 둘 중 하나 아무거나 실수로 바꿔줘라~~

		System.out.printf("합계는 %d 평균은 %.2f 입니다", sum, avg);
	}

}
