package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MakeMessage;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserRegisterTest {

	public static void main(String[] args) {
		// service 안에 있는 register 테스트해보자
		CRUDService<String, UserDTO> service = new UserService();
		UserDTO obj = new UserDTO("id01", "pwd01", "jinhee", "rlawls2422@naver.com", "010-7659-0206");
		UserDTO obj2 = new UserDTO("id02", "pwd01", "jinhee", "rlawls2422@naver.com", "010-7659-0206");
		UserDTO obj3 = new UserDTO("id03", "pwd01", "jinhee", "rlawls2422@naver.com", "010-7659-0206");
		try {
			service.register(obj);
			service.register(obj2);
			service.register(obj3);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(MakeMessage.makeMessage(e.getMessage()));

		}
		UserDTO user = null;
		try {
			user = service.get("id01");
			System.out.println(user);
		} catch (Exception e) {

			e.printStackTrace();
		}

		List<UserDTO> list = null;
		try {
			list = service.get();
			for (UserDTO u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {

		}
		
		//---------remove test--------------------------------
		try {
			service.remove("id01");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//탈퇴후 재확인....
		List<UserDTO> list2 = null;
		try {
			list2 = service.get();
			for (UserDTO u : list2) {
				System.out.println(u);
			}
		} catch (Exception e) {

		}
		
//-----------------removetest2------
		try {
			service.remove("id05");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
