package ifcontrol;

public class P84 {

	public static void main(String[] args) {

		String grade = ""; // 초기화

		String gender = "F";
		double sum = 80.0;

		// return; //더 이상 진행하지 말고 끝내라는 의미!

		System.out.println("Start....");

		if (gender.equals("M")) {
			System.out.println("Male....");
		} else {
			System.out.println("Female....");
		}

//		if (gender.equals("M")) {
//			if (sum >= 90) {
//				grade = "MVIP";
//			} else if (sum >= 80) {
//				grade = "MGOLD";
//			} else {
//				grade = "MNORMAL";
//			}
//		}
//
//		if (gender.equals("F")) {
//			if (sum >= 90) {
//				grade = "FVIP";
//			} else if (sum >= 80) {
//				grade = "FGOLD";
//			} else {
//				grade = "FNORMAL";
//			}
//		}

		grade = (gender.equals("M")) ? 
				((sum >= 90) ? "MVIP" : (sum >= 80) ? "MGOLD" : "MNORMAL") :
				((sum >= 90) ? "FVIP" : (sum >= 80) ? "FGOLD" : "FNORMAL");

//switch문 순서 상관없음
//		switch (grade) {
//		case "FVIP":
//			sum += 100;
//			break;
//		case "FGOLD":
//			sum += 90;
//			break;
//		case "MVIP":
//			sum += 100;
//			break;
//		case "MGOLD":
//			sum += 90;
//			break;
//		default:
//			sum += 10;
//		}
//왜 if문 안쓰고 switch 문 쓰냐 아래처럼 간단하게 바꿀 수 있기에!

		switch (grade) {
		case "FVIP":
		case "MVIP":
			sum += 100;
			break;
		case "FGOLD":
		case "MGOLD":
			sum += 90;
			break;
		default:
			sum += 10;
		}
//break가 없으면 vip들은 100도 받고 90도 받고 10도 받고!!! 이건 if문으로 쓰기 정말 어려움. 특히 관리자에게 업무 부여할 때 switch 코드가 유용!	

		System.out.printf("%s,%s,%.2f\n", grade, gender, sum);
		System.out.println("End...");

	}

}
