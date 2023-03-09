package com.kbstar.frame;

public class MakeMessage {
	// public static String makeMessage(String code) 직적 입력한거... static 공부좀 하자...
	public static String makeMessage(String code) {
		String result = "";
		switch (code) {
		case "EX0001":
			result = "계좌개설 실패..";
			break;
		case "EX0002":
			result = "음수입력..";
			break;
		case "EX0003":
			result = "잔액 부족..";
			break;
		case "EX0004":
			result = "중복된 아이디....";
			break;
		case "EX0005":
			result = "존재하지 않는 id";
			break;
		case "EX0006":
			result = "존재하지 않는 계좌번호...";
			break;
		default:
			result = "고객센터에 문의하세요";
		}
		return result;

	}
}
