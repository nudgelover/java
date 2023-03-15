package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> Service = new CartCRUDServiceImpl();
// INSERT TEST-------------------------------------------------------------

//		Cart cart = new Cart("id03","2023314876700", 3, null);
//
//		try {
//			Service.register(cart);
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

// UPDATE TEST-------------------------------------------------------------
		
//	Cart cart = new Cart(11,"2023314485101");
//		try {
//			Service.modify(cart);;
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//
//		}

// DELETE TEST-------------------------------------------------------------

		try {
			Service.remove("2023314542101");
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
// select TEST-------------------------------------------------------------
//		Cart cart = null;
//		try {
//			cart = Service.get("2023314551104");
//			System.out.println(cart);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

// selectALL TEST-------------------------------------------------------------
//		List<Cart> cart;
//		try {
//			cart = Service.get();
//			if (cart.size() == 0) { 
//				System.out.println("데이터가 없습니다.");
//			} else {
//				for (Cart data : cart) {
//					System.out.println(data);
//				
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
	}
}
