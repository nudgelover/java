package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
		  int bb = 100; //깃테스트 추가용
	      String s1 = "10";
	      // string을 int로 바꿀 때
	      int s2 = Integer.parseInt(s1);
	      int a = 10;
	      System.out.println(s2 + a);

	      int n1 = 10;
	      // int를 string으로 바꿀 때
	      // String n2 = n1+"";
	      String n2 = String.valueOf(n1);

	      Random r = new Random();
	      int rndNum = r.nextInt(45) + 1;
	      // 45만 입력하면 0~44. +1을 하면 1~45
	      System.out.println(rndNum);
	   


	}

}
