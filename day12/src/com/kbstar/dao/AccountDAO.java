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

	@Override
	public List<AccountDTO> search(Object obj) throws Exception {
		// 내 계좌 조회
		// obj : 사용자의 id
		// object obj = new String();
		// 자바의 모든 기능은 object에서 받은거니 당연히 string도 가능!

		// 만약 해당 계좌번호가 없으면 오류 보내야겠네!
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		// 생성을 해야할 때는 new, 불러오기만 할때는 null~
		Collection<AccountDTO> col = db.values();

		for (AccountDTO acc : col) {
			// 계좌 중에서 id가 obj와 같은 같은 것들만 집어넣어라...!
			if (acc.getHolder().equals(obj)) {
				list.add(acc);
			}
		}
		return list;
	}

}
