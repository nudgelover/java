package p214;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int num = 0;
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Input num...");
			num = Integer.parseInt(sc.next()); // 여기서 e2 Exception 발생
			int result = 10 / num; // 여기서 e1 Exception 발생
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못입력하셨습니다.");
		}
		System.out.println("END APP...");
	}
}
