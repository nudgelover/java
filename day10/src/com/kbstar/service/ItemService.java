package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;

public class ItemService implements Service<Integer, ItemDTO>, SearchService{
	// 3번째로 service 만들자~
	// DAO랑 연결해주자~
	DAO<Integer, ItemDTO> dao;

	public ItemService() {
		dao = new ItemDAO();
	};
	// DAO랑 연결해야 정보를 DAO로 넘기니까~, 만약 오라클에서 mySQL로 바뀌게 되면 DAO랑 이부분만 바꾸면 샤샤샥

	@Override
	public void register(ItemDTO v) throws Exception {
		System.out.println(v + "Data Check...");
		try {
			dao.insert(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send SMS to Director");

	}

	@Override
	public void remove(Integer k) throws Exception {
		System.out.println(k + "Data Check...");
		try {
			dao.delete(k);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send SMS to Director");

	}

	@Override
	public void modify(ItemDTO v) throws Exception {
		System.out.println(v + "Data Check...");
		try {
			dao.update(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send SMS to Director");

	}
	
	@Override
	public void search() {
		System.out.println("Search...");
		
	}

	

}
