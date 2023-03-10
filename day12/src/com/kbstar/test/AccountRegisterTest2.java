package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.service.AccountService;

public class AccountRegisterTest2 {

	public static void main(String[] args) throws Exception {
		CRUDService<String, AccountDTO> service = new AccountService();
		AccountDTO obj = new AccountDTO(MakeAccountNumber.makeAccNum(), 10000, "id01");

		AccountDTO obj2 = new AccountDTO(MakeAccountNumber.makeAccNum(), 20000, "id01");

		AccountDTO obj3 = new AccountDTO(MakeAccountNumber.makeAccNum(), 30000, "id02");

		try {
			service.register(obj);
			service.register(obj2);
			service.register(obj3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// get(k) test ------------------------------------
		AccountDTO Account = null;
		try {
			Account = service.get("2023310100");
			System.out.println(Account);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("-----------------------------------------------------");
		List<AccountDTO> list = null;

		try {
			list = service.get();
			for (AccountDTO u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// remove() test ------------------------------------
		System.out.println("-----------------------------------------------------");
		try {
			service.remove("2023310100");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		List<AccountDTO> list2 = null;

		try {
			list2 = service.get();
			for (AccountDTO u : list2) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("-----------------------------------------------------");

		try {
			service.remove("xxxxx");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//일부로 없는 거 삭제하고 예외처리 하는거좀 하자!!!!
	}

}
