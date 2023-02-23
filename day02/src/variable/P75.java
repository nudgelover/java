package variable;

import java.util.Random;
import java.util.Scanner;

public class P75 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
//		a++;
//		++b;
		System.out.printf("%d,%d\n", a, b);

		int result = ++a + b++;
		System.out.printf("%d,%d\n", a, b);
		System.out.println(result);

		int aa = 10;
		int bb = 10;

//		System.out.println((aa++ >= 0) | (bb++ >= 0));
//		System.out.printf("%d,%d\n", aa, bb);
		// | 하나는 양쪽 다 체크. 값 11,11 나옴 속도가 느림. 반드시 뒷값도 증가시여한다면 쓰겠지만.. 쓸일이 없겠쥬?

		System.out.println((aa++ >= 0) || (bb++ >= 0));
		System.out.printf("%d,%d\n", aa, bb);
		// ||는 앞에가 true이면 뒤에는 아예 처리를 안함... 그래서 얘는 값이 11,10이 나옴
	}

}
