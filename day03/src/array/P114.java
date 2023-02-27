package array;

import java.util.Random;

public class P114 {

	public static void main(String[] args) {

		int arr[][] = new int[5][5]; // 가로 5개 세로 5개 총 25칸
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(9) + 1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println("");

			// p119 for each 문까지 참고
		}
	}
}
