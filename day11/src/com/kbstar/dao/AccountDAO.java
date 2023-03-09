package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;

public class AccountDAO implements DAO<String, AccountDTO> {

	HashMap<String, AccountDTO> db;

	public AccountDAO() {
		db = new HashMap<String, AccountDTO>();
	}

	@Override
	public void insert(AccountDTO v) throws Exception {
		db.put(v.getAccNO(), v);

	}

	@Override
	public void delete(String k) throws Exception {
		if (!db.containsKey(k)) {
			throw new Exception("EX0006");
		}
		db.remove(k);
	}

	@Override
	public void update(AccountDTO v) throws Exception {
		// 수정기능 없음
	}

	@Override
	public AccountDTO select(String k) throws Exception {
		AccountDTO obj = null;
		if (!db.containsKey(k)) {
			throw new Exception("EX0006");
		}
	
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<AccountDTO> select() throws Exception {
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		Collection<AccountDTO> col = db.values();
		for (AccountDTO obj : col) {
			list.add(obj);
		}
		return list;
	}

}
