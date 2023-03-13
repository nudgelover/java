package com.kbstar.test;

import java.util.List;

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

//		try {
//			crudService.remove("id20");
//			System.out.println("성공");
//		} catch (Exception e) {
//		System.out.println(e.getMessage());
//			e.printStackTrace();

// select TEST-------------------------------------------------------------
//		try {
//			Cust cust = crudService.get("id01");
//
//			System.out.println(cust.getId() + " " + cust.getPwd() + " " + cust.getName() + " " + cust.getAge());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

// selectALL TEST-------------------------------------------------------------
		List<Cust> cust;
		try {
			cust = crudService.get();
			for (Cust data : cust) {
				System.out.println(data.getId() + " " + data.getPwd() + " " + data.getName() + " " + data.getAge());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
