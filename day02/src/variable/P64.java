package variable;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		double d = 123456789.234;
		String str1 = "abc";
		String str2 = "abc";
		str1 = "def";
		System.out.printf("%d %.2f %s\n", a, d, str1);
		if (str1 == str2) {
			System.out.println("OK");
		}
		// 주소(번지)만 일치한건지 확인
		if (str1.equals(str2)) {
			System.out.println("OK2");
			// 스트링의 내용까지 일치하는지 까지 확인 abc=abc
			// 66페이지 하단 참고
		}

		String str3 = new String("abc");
		String str4 = new String("abc");
	}

}
