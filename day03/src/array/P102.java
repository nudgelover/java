package array;

import java.util.Arrays;

public class P102 {

	public static void main(String[] args) {

		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr); // 값이 아니라 arr의 주소가 보임 arr는 래퍼런스 구조이기에!!stack 영역에 주소가 저장되고 heap(인티저) 영역에 arr의 값 저장

		for (int i = 0; i < arr.length; i++) { // for문을 써야 확인가능함! 배열의 위치가 중요할 땐 이 구문!
			System.out.printf("%d\t", arr[i]);

		}

		System.out.println("TYPE 2"); // 방법2 배열의 값이 중요할 떄는 이 구문!
		for (int data : arr) {
			System.out.printf("%d\t", data);
		}
		
		System.out.println(Arrays.toString(arr)); //방법 3
		//이 방법들을 다 알아야함 why? p103 참고해라.
	}

}
