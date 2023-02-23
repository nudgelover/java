package variable;

import java.util.Random;
import java.util.Scanner;

public class P74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오(10~100)");
		String cmd = sc.next();
		System.out.printf("%s를 입력했습니다.", cmd);
		
		// 10~100사이의 정수를 입력받는다.
		// 1부터 입력받은 숫자 까지의 범위에서 랜덤한 숫자를 발생하시오
		Random r = new Random();
		int cmd2 = Integer.parseInt(cmd);
		int rndNum = r.nextInt(cmd2)+ 1;

		System.out.printf("랜덤숫자는 %s 입니다.", rndNum);
		sc.close();

	}

}
