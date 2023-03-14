package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
// INSERT TEST-------------------------------------------------------------

//		Cust cust = new Cust("id02", "pwd02", "jin", 10);
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

//		try {
//			crudService.remove("id20");
//			System.out.println("성공");
//		} catch (Exception e) {
//		System.out.println(e.getMessage());
//			e.printStackTrace();

// select TEST-------------------------------------------------------------
//		Cust cust = null;
//		try {
//			cust = crudService.get("id02");
//			System.out.println(cust);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

// selectALL TEST-------------------------------------------------------------
		List<Cust> cust;
		try {
			cust = crudService.get();
			if (cust.size() == 0) { //예외 안나기에..! 만들어준것!
				System.out.println("데이터가 없습니다.");
			} else {
				for (Cust data : cust) {
					System.out.println(data);
				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
