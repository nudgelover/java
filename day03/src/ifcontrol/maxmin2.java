package ifcontrol;

import java.util.Arrays;

public class maxmin2 {

	public static void main(String[] args) {

		int arr[] = { 3, 10, 40, 2, 5, 237, 4 };

//	Arrays.sort를 이용한 방법
		Arrays.sort(arr);
		System.out.printf("MAX : %d , MIN : %d", arr[arr.length - 1], arr[0]);
	}

}
