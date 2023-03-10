package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
//	1. 변수 설명
//	winningNum: HashSet<Integer>
//	당참 번호 1~25까지의 숫자 중 3개를 선정
//	prizeMoney: double
	private HashSet<Integer> winningNum;
	private double prizeMoney;
	Random r = new Random();
	int cnt = 0;
	int grade = 0;

	public Lotto() {
		winningNum = new HashSet<Integer>();
	}

	public Lotto(HashSet<Integer> winningNum, double prizeMoney) {
		this.winningNum = winningNum;
		this.prizeMoney = prizeMoney;
	}

	public ArrayList<Integer> getNumUser() {
		ArrayList<Integer> userNum = new ArrayList<>(); // 사용자의 로또번호 set
		int num = 0; // 사용자에게 받는 번호
		Scanner sc = new Scanner(System.in);

		// 1~25까지 숫자 3개를 받아 넣어준다.
		System.out.println("자~ 지금부터 1~25까지의 숫자 3개를 입력 받겠습니다. 신의 가호가 있기를~!");
		while (userNum.size() < 3) {
			System.out.println("==숫자를 입력해주세요==");
			try {
				num = Integer.parseInt(sc.next());
				if (!(num >= 1 && num <= 25)) {
					System.out.println("== 1~25까지의 숫자를 입력해주세요 ==");
				} else {
					if (userNum.contains(num)) {
						System.out.println("== 중복된 숫자가 있어 재입력 바랍니다 ==");
					} else {
						userNum.add(num); // set에 추가
						System.out.println("== " + userNum.size() + "개 입력되었습니다 ==");
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("== 숫자로 입력해주세요 ==");
			}
		}
		System.out.println("고객님께서 선택하신 번호는 아래와 같습니다.");
		
		for (Integer number : userNum) {
			System.out.println(number);
		}
		
		System.out.println("오늘의 당첨번호와 당첨금액은~~!");
		makeWinningNumberMoney();

		return userNum;
	}

	public void makeWinningNumberMoney() {
		// 당첨 번호와 당첨금을 생성 한다.

		while (winningNum.size() < 3) {
			winningNum.add(r.nextInt(25) + 1);
		}

		prizeMoney = r.nextInt(2000000000) + 1;
		System.out.println("당첨번호는 " + winningNum + "입니다.");
		System.out.printf("총 당첨금액은 %.0f 원 입니다.\n", prizeMoney);
	}

	public int checkRanking(ArrayList<Integer> myNum) {
		// 본인이 입력한 숫자 3개를 argument로 입력 하면
		// 몇개가 일치한지를 check 한후 등수를 리턴
		// 등수는 자유롭게 설정

		for (Integer data : myNum) {
			if (winningNum.contains(data)) {
				cnt++;
			}
		}

		if (cnt == 3) {
			grade = 1;
		} else if (cnt == 2) {
			grade = 2;
		} else if (cnt == 1) {
			grade = 3;
		} else {
			grade = 4;
		}
		return grade;

	}

	public double prizeMoney(int grade) {
		double myMoney = 0.0;
		if (grade == 1) {
			myMoney = prizeMoney * 0.5;

		} else if (grade == 2) {
			myMoney = prizeMoney * 0.3;

		} else if (grade == 3) {
			myMoney = prizeMoney * 0.2;

		};
		return myMoney;
	}

	public int getGrade() {
		return grade;
	}

}
