package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.ShopService;

public class ShopServiceImpl implements ShopService<Cust, Cart> {
	DAO<String, String, Cust> custDao; // 키값 string 이고 우리 search 할때도 string 쓸 거니까!
	DAO<String, String, Item> itemDao;
	DAO<String, String, Cart> cartDao;

	public ShopServiceImpl() {
		custDao = new CustDaoImpl();
		itemDao = new ItemDaoImpl();
		cartDao = new CartDaoImpl();
	}

	@Override
	public Cust login(String id, String pwd) throws Exception {
		Cust cust = null;
		cust = custDao.select(id);
		if (cust != null) {
			if (cust.getPwd().equals(pwd)) {
				System.out.println("로그인 OK");
			} else {
				throw new Exception("PWD가 일치하지 않습니다.");
			}
		} else {
			throw new Exception("로그인실패");
		}
		return cust;
	}

	@Override
	public void regsiter(Cust v) throws Exception {
		try {
			custDao.insert(v);
		} catch (Exception e) {
			throw new Exception("등록오류");
		}
		//만약 더 기능 원한다면 notification 더 추가할 수 있겠쮸?
	}

	@Override
	public List<Cart> myCart(String id) throws Exception {
		List<Cart> list = null;
		list = cartDao.search(id);
		return list;
		//Exception 처리 어떻게할까...? 만약 카트에 아무것도 없어..! 그러면 예외처리 해야겠네...
	}

}
