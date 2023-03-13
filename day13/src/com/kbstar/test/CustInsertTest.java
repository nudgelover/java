package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
// INSERT TEST-------------------------------------------------------------
		
//		Cust cust = new Cust("id20", "pwd30", "tom", 30);
//
//		try {
//			crudService.register(cust);
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

// UPDATE TEST-------------------------------------------------------------

//	Cust cust = new Cust("id20", "pwd30", "jack", 30);
//		try {
//			crudService.modify(cust);;
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

// DELETE TEST-------------------------------------------------------------

		try {
			crudService.remove("id20");
			System.out.println("성공");
		} catch (Exception e) {
		System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
