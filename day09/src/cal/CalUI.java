package cal;

import java.util.Scanner;

public class CalUI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("INPUT 2 NUMBER");
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		double result;
		try {
			result = Cal.div(a, b);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("분모가 0입니다");
			e.printStackTrace();
		}
	
		sc.close();

	}

}
