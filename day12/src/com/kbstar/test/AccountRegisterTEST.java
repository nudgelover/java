package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountService;

public class AccountRegisterTEST {

	public static void main(String[] args) throws Exception {
		CRUDService<String, AccountDTO> service = new AccountService();
		AccountDTO obj1 = new AccountDTO("97659020662", 50000, "JINHEKIM");
		AccountDTO obj2 = new AccountDTO("01234567890", 50000, "KIM");
		AccountDTO obj3 = new AccountDTO("09876543210", 50000, "LEE");
		try {
			service.register(obj1);
			service.register(obj2);
			service.register(obj3);
		} catch (Exception e) {

			e.printStackTrace();
		}

		AccountDTO account = null;
		try {
			account = service.get("97659020662");
			System.out.println(account);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("---------------------------------");
		
		List<AccountDTO> list = null;
		try {
			list = service.get();
			for (AccountDTO acc : list) {
				System.out.println(acc);
			}
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
		
		System.out.println("----------removetest-----------------");
		
		try {
			service.remove("97659020662");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		List<AccountDTO> list2 = null;
		try {
			list2 = service.get();
			for (AccountDTO acc : list2) {
				System.out.println(acc);
			}
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		

	}

}
