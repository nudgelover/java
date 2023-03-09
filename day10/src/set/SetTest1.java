package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		// 1~10까지의 숫자를 10개 입력해라
		Random r = new Random();
//		int rndNum = 0;
//		for (int i = 0; i < 10; i++) {
//			rndNum = r.nextInt(10) + 1;
//			if (!set.contains(rndNum)) {
//				set.add(rndNum);
//				continue;
//			}
//
//		} 이건 내가 해보던거....

		
		while(set.size()<10) {
			int num =r.nextInt(10) + 1;
			set.add(num);
		}
		
		System.out.println("리스트 개수 : " + set.size());
		for (int data : set) {
			System.out.println(data);
		}

	}
}
