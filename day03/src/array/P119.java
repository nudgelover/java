package array;

import java.util.Random;

public class P119 {

	public static void main(String[] args) {

		int arr[][] = new int[5][5]; // 가로 5개 세로 5개 총 25칸
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(9) + 1;
			}
		}

//p114 배열 for each문으로 변경 해보기 

		for (int a[] : arr) {
			for (int data : a) {
				System.out.printf("%d\t", data);
			}
			System.out.println("");
		}
	}
}
