package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");

		System.out.println(map.size());
		System.out.println(map.containsKey(7));
		System.out.println(map.containsValue("D"));
		System.out.println(map.get(1));

//		for(int data:map) {
//		System.out.println(map);
//	}
//집합체에 1개가 아닌 2개의 값이 있기에 for문으로 못돌림....
		System.out.println("-----------------------------------");
		// 자 데이터를 먼저 Set값으로 받자
		Set<Integer> keys = map.keySet();
		
		System.out.println(keys.toString());
		//키값먼저 빼고
		
		for (int data : keys) {
			System.out.println(map.get(data));
		}
		//데이터값 아웃.
	}

}
