package ifcontrol;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {
		// 숫자 4개의 두자리수를 입력받는다.
		// 단, 항상 2자리수 이어야한다. 00이 들어오는 것도 안됨.
		// 만약 2자리수가 아니면 프로그램 종료.

		// 평균과 합계를 구합니다.

		// 평균 90 이상이면 A
		// 평균 80 이상이면 B
		// 평균 70 이상이면 C
		// 평균 60 이상이면 D
		// 60 미만이면 F
		Scanner sc = new Scanner(System.in);
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;
		int sum = 0;
		double avr = 0;

		System.out.println("국어성적 입력 :)");
		ko = Integer.parseInt(sc.next());// sc.next 값은 str이니 변환해줘샹함!
		if (!(ko >= 10 && ko <= 99)) {
			System.out.println("점수는 두자리수로 입력해주세요");
			sc.close();
			return;
		}

		System.out.println("영어성적 입력 :)");
		en = Integer.parseInt(sc.next());
		if (!(en >= 10 && en <= 99)) {
			System.out.println("점수는 두자리수로 입력해주세요");
			sc.close();
			return;

		}

		System.out.println("수학성적 입력 :)");
		ma = Integer.parseInt(sc.next());
		if (!(ma >= 10 && ma <= 99)) {
			System.out.println("점수는 두자리수로 입력해주세요");
			sc.close();
			return;

		}

		System.out.println("과학성적 입력 :)");
		si = Integer.parseInt(sc.next());
		if (!(si >= 10 && si <= 99)) {
			System.out.println("점수는 두자리수로 입력해주세요");
			sc.close();
			return;
		}

		sum = ko + en + ma + si;
		avr = sum / 4.0;

//		String grade = "";
//		if (avr >= 90) {
//			grade = "A";
//		} else if (avr >= 80) {
//			grade = "B";
//		} else if (avr >= 70) {
//			grade = "C";
//		} else if (avr >= 60) {
//			grade = "D";
//		} else {
//			grade = "F";
//		}
		
		String grade = "";
		grade = (avr >= 90) ? "A" : (avr >= 80) ? "B" : (avr >= 70) ? "C" : (avr >= 60) ? "D" : "F";

		System.out.printf("평균 : %.2f, 합계 :%d", avr, sum);
		System.out.println("당신의 등급은 '" + grade + "' 입니다.");

		sc.close();
	}

}
