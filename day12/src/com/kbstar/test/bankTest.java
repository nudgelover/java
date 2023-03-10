package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceImpl;

public class bankTest {

	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String> service = new BankServiceImpl();

		// Register
		UserDTO user = new UserDTO("id01", "pwd01", "김진희", "rlawls2422@naver.com", "01076590206");
		try {
			service.register(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Login

		String id = "id01";
		String pwd = "pwd02";
		//UserDTO loginUser = null;
		//이거를 ~~한뒤에 뒤에를 이렇게 채워주면 됨!!!
		UserDTO loginUser = null;
		try {
			loginUser = service.login(id, pwd);
			System.out.println(loginUser);
			System.out.println(id+"님의 방문을 환영합니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
