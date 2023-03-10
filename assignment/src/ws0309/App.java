package ws0309;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> userNum = null;
		Lotto lotto = new Lotto();


		System.out.println("325 Lotto에 오신것을 환영합니다.");
		System.out.println("어제 좋은 꿈 꾸셨나요? 당신에게 큰 행운이 다가오길 바랍니다.");
		
		
		userNum = lotto.getNumUser();

		try {
			System.out.println("고객님의 등수는 "+ lotto.checkRanking(userNum)+"등 입니다");
			System.out.printf("고객님의 당첨금액은 %.0f원 입니다.",lotto.prizeMoney(lotto.getGrade()));
			
		} catch (Exception e) {
			System.out.println("아쉽지만 금번 회차에서는 낙첨되셨습니다. ㅠㅠ 다음에 또 도전해주세요!");
		}
		

		sc.close();
	}
}