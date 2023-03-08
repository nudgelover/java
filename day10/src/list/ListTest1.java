package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {

		// List list = new ArrayList(); 이렇게 하면 다양한 데이터 다 쓸 순 있지만 ...이렇게는 거의 안쓴다.
		List<Integer> list = new ArrayList<Integer>();
		//List 인터페이스! 
//		list.add(10);
//		list.add(20);
//		list.add(30);

		Random r = new Random();
		for (int i = 1; i <= 10; i++) {
			int rndNum = r.nextInt(10) + 1;
			list.add(rndNum);
		}
		list.add(0, 100);// 0번째에 100을 추가해라
		list.add(5, 5);
		list.remove(0); //0번째 데이터 지워라.
		// 사이즈는 들어갈 때마다 자동 증가 된다.
		for (int data : list) {
			System.out.println(data);
		 
		}
	}

}
