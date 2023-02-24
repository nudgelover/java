package ifcontrol;

public class P88 {

	public static void main(String[] args) {

		String grade = ""; // 초기화

		String gender = "M";
		double sum = 73.0;

		// return; //더 이상 진행하지 말고 끝내라는 의미!
		System.out.println("Start....");
		
		
		if (gender.equals("M")) {
			System.out.println("Male....");
		} else {
			System.out.println("Female....");
		}

		
		if ((sum <= 100 && sum >= 95) || (sum <= 90 && sum >= 85)) {
			grade = "VIP";
		} else if ((sum <= 80 && sum >= 75) || (sum <= 65 && sum >= 60)) {
			grade = "GOLD";
		} else {
			grade = "NORMAL";
		}

		

		if (grade.equals("VIP"))

		{
			System.out.println("VIP 혜택.....");
		}

		System.out.printf("%s,%s,%.2f\n", grade, gender, sum);
		System.out.println("End...");

	}

}
