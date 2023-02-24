package ifcontrol;

public class P87 {

	public static void main(String[] args) {

		String grade = ""; // 초기화

		String gender = "M";
		double sum = 80.0;

		// return; //더 이상 진행하지 말고 끝내라는 의미!
		System.out.println("Start....");
		
		
		if (gender.equals("M")) {
			System.out.println("Male....");
		} else {
			System.out.println("Female....");
		}

//		if (sum >= 90.0) {
//			grade = "VIP";
//		} else if (sum >= 80.0) {
//			grade = "GOLD";
//		} else if (sum >= 70.0) {
//			grade = "SILVER";
//		} else if (sum >= 60.0) {
//			grade = "BRONZE";
//		} else {
//			grade = "NOMAL";
//		}

		grade = (sum >= 90) ? "VIP" : (sum >= 80) ? "GOLD" : (sum >= 70) ? "SILVER" : (sum >= 60) ? "BRONZE" : "NOMAL";


		if (grade.equals("VIP")) {
			System.out.println("VIP 혜택.....");
		}

		System.out.printf("%s,%s,%.2f\n", grade, gender, sum);
		System.out.println("End...");

	}

}
