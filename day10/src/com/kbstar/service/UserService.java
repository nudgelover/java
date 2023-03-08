package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String, UserDTO> {
	DAO<String, UserDTO> dao;

	// Service는 DAO를 통해서 DB에 집어넣으니까
	public UserService() {
		dao = new UserDAO();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		System.out.println("Security Check...");
		try {
			dao.insert(v);
		} catch (Exception e) {
			throw e;
		} // try catch 해도 되고...throws Exception 만 더해도 되고 ... 상황에 따라...!
			// 의미는 거의 똑같은데 try catch는 로그를 찍을 수 있으니 로그분석 가능...!

		System.out.println("Send mail...");
		System.out.println("Send SMS");
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send SMS");

	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send SMS");

	}

}
