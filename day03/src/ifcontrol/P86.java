package ifcontrol;

public class P86 {

	public static void main(String[] args) {

		String grade = ""; // 초기화

		String gender = "M";
		double sum = 80.0;

		System.out.println("Start....");
		// return; //더 이상 진행하지 말고 끝내라는 의미!

		if (gender.equals("M")) {
			System.out.println("Male....");
		} else {
			System.out.println("Female....");
		}

		/*
		 * if (sum >= 90.0) { grade = "VIP"; } else if (sum >= 70.0) { grade = "GOLD"; }
		 * else { grade = "SILVER"; }
		 */

		grade = (sum >= 90.0) ? "VIP" : (sum >= 70.0) ? "GOLD" : "SILVER";

		if (grade.equals("VIP")) {
			System.out.println("VIP 혜택.....");
		}

		System.out.printf("%s,%s,%.2f\n", grade, gender, sum);
		System.out.println("End...");

	}

}
