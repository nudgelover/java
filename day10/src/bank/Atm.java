package bank;

public class Atm {

	public static void main(String[] args) {
		Account acc1 = null; // 객체는 초기화 null

		try {
			acc1 = new Account(0);
			System.out.println(acc1);
			acc1.widthdraw(10);
		} catch (Exception e) {
			System.out.println(
					"고객님 고객센터에 문의 하세요. 불편을 드려 죄송합니다. " + MakeMessage.makeMessage(e.getMessage()));
			System.out.println(e.getMessage());
			// e.printStackTrace(); 이건 개발자 도구다..
		}

	}

}
