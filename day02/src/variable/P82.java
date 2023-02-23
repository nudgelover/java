package variable;

import java.util.Scanner;

public class P82 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 점수를 알려주세요");
		int score = Integer.parseInt(sc.next());

		// String grade = "";
		// if (score > 90) {
		// grade = "A";
		// } else if (score >= 80) {
		// grade = "B";
		// } else if (score >= 60){
		// grade = "C";
		// } else {
		// grade="D";
		// }
		// System.out.println(grade);
		// sc.close();

		String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >=60)? "C":"D";
		System.out.println(grade);
		sc.close();
	}
}
