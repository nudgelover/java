package variable;

public class P69 {

	public static void main(String[] args) {
		String str = "abcdef";
		str = str.toUpperCase();
		System.out.println(str);
		// str은 바꿀 수 없기에 upper 오른쪽에서 실행되서 str에 재입력되면 주소번지 달라짐! 즉 위에 str이 100번지라면 밑에 str은
		// 101...

		String str2 = str.replace('A', 'Z');
		System.out.println(str2);
		// 주소 가지고 뭘하고싶다! 뒤에 .을 찍음
		int lng = str.length();
		System.out.println(lng);

		int t = str.indexOf("B");
		System.out.println(t);

		char c = str.charAt(0);
		System.out.println(c);
		// 0번째 캐릭터 가져와라

		String str3 = str.substring(1, 3);
		System.out.println(str3);
		// 1,3

		//String email = "wlsgml2422@gmail.com";
		
		String id = "";
		String domain = "";
		
		System.out.printf("%s, %s", id, domain);

	}

}
