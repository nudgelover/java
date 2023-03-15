package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.ShopService;
import com.kbstar.service.ShopServiceImpl;

public class MycarselectALLTEST {

	public static void main(String[] args) {
		ShopService<Cust, Cart> Service = new ShopServiceImpl();

// mycarselectALL TEST-------------------------------------------------------------
		List<Cart> cart;
		try {
			cart = Service.myCart("id03");
			if (cart.size() == 0) { 
				System.out.println("데이터가 없습니다.");
			} else {
				for (Cart data : cart) {
					System.out.println(data);
				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
