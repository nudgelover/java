package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class itemInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Item> Service = new ItemCRUDServiceImpl();
	
// INSERT TEST-------------------------------------------------------------

//		Item item = new Item("ttt", 20000, 3.2);
//
//		try {
//			Service.register(item);
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

// UPDATE TEST-------------------------------------------------------------

//	Item item = new Item("2023314117100", "shirt", 30000, 1.5);
//		try {
//			Service.modify(item);
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//
//		}

// DELETE TEST-------------------------------------------------------------

//		try {
//			Service.remove("2023314117100");
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

// select TEST-------------------------------------------------------------
		Item item = null;
		try {
			item = Service.get("2023314159100");
			System.out.println(item);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

// selectALL TEST-------------------------------------------------------------
		List<Item> item1;
		try {
			item1 = Service.get();
			if (item1.size() == 0) { //예외 안나기에..! 만들어준것!
				System.out.println("데이터가 없습니다.");
			} else {
				for (Item data : item1) {
					System.out.println(data);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
