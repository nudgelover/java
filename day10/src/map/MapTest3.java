package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.kbstar.dto.UserDTO;

public class MapTest3 {

	public static void main(String[] args) {
		Map<String, UserDTO> db = new HashMap<String, UserDTO>();
		db.put("id01", new UserDTO("id01", "pwd01", "james1"));
		db.put("id02", new UserDTO("id02", "pwd02", "james2"));
		db.put("id03", new UserDTO("id03", "pwd03", "james3"));

		// 불러오기
		UserDTO u = db.get("id01");
		System.out.println(u);

		// 불러오기2 (내가 찾은 방법)
		System.out.println(db.get("id02"));

		// 수정
		UserDTO uu = new UserDTO("id02", "00000", "james2");
		db.put(uu.getId(), uu);
		System.out.println(db.get("id02"));

		// 전체 사용자 정보 전부 출력하기

		System.out.println("---------------------------------");
		// 모든 데이터값 아웃.
		System.out.println(db.values());

		Collection<UserDTO> col = db.values();
		for (UserDTO user : col) {
			System.out.println(user);
		}
	}
}
