package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	private HashSet<Integer> winningNum;
	private double prizeMoney;
	Random r = new Random();

	public Lotto() {
		winningNum = new HashSet<Integer>();

	}

	public void makeWinningNumberMoney() {
		// 번호 생성, 당첨금 생성
		while (winningNum.size() < 3) {
			int num = r.nextInt(25) + 1;
			winningNum.add(num);
		}

		prizeMoney = r.nextInt(2000000000) + 1;

		System.out.println("당첨번호는 " + winningNum.toString() + "입니다.");
		System.out.printf("총 당첨금액은 %.0f 입니다\n", prizeMoney);
	}

	public int checkRanking(ArrayList<Integer> myNum) throws Exception {
		int grade = 0;
		int count = 0;
//		for(Integer data:myNum) {
//			if(winningNum.contains(data)) {
//				count++;
//			}
//		}
//		
		for (int num : myNum) {
			for (int prizeNum : winningNum) {
				if (num == prizeNum) {
					count++;
				}
			}
		}

		switch (count) {
		case 3:
			grade = 1;
			break;
		case 2:
			grade = 2;
			break;
		case 1:
			grade = 3;
			break;
		default:
		 throw new Exception("꽝");
		}

		return grade;
	}

	public double prizeMoney(int grade) {
		double pMoney = 0.0;

		switch (grade) {
		case 1:
			pMoney = prizeMoney * 0.7;
			break;
		case 2:
			pMoney = prizeMoney * 0.2;
			break;
		case 3:
			pMoney = prizeMoney * 0.1;
			break;
		default:
			pMoney = 0.0;
		}
		return pMoney;
	}

	public double getPrizeMoney() {
		return prizeMoney;
	}

}
