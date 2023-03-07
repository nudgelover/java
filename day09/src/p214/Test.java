package p214;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num...");

		try {
			int num = Integer.parseInt(sc.next()); // 여기서 e2 Exception 발생
			int result = 10 / num; // 여기서 e1 Exception 발생
			System.out.println(result);
		} catch (ArithmeticException e1) {
			System.out.println("분모가 0입니다.");
			e1.printStackTrace(); // 어떤 오류가 났는지 궁금하면 개발자가 볼수 있겠금 하는 것. 실제 고객에게 나갈 때는 지워야함...!
			return; // 여기에 return을 넣게 되면 오류 시 밑의 코드는 실행이 안되지만... sc.close도 안됨... ㅜㅜ 
					//finally로 해결 가능!
		} catch (NumberFormatException e2) {
			System.out.println("숫자를 입력하세요");
			return;
		} finally {
			sc.close();
			System.out.println("END APP...");
		}
	}

}
