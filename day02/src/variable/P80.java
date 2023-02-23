package variable;

public class P80 {

	public static void main(String[] args) {
		int score = 95;
		String grade;
		if (score > 90) {
			grade = "a";
		} else if (score > 60) {
			grade = "b";
		} else {
			grade = "c";

		}
		System.out.println(grade);
	}
}
