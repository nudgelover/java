package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		//List<Integer> list = new ArrayList<Integer>();
		List<Integer> list = new LinkedList<Integer>();
		//둘의 차이... LinkedList가 더 빠르다고함 
		
		// 1~10까지의 숫자를 20개 입력 한다.
		// 단, while 문을 이용한다. (list.size 함수르 사용해봐라)
		Random r = new Random();
	
	

		while (list.size()<20) {
			int rndNum = r.nextInt(10) + 1;
			list.add(rndNum);
		}
		
		System.out.println("리스트 개수 : " + list.size());
		for (int data : list) {
			System.out.println(data);
		}
	}

}
