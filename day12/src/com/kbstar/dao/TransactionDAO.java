package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;

public class TransactionDAO implements DAO<String, TransactionDTO> {
	HashMap<String, TransactionDTO> db;

	public TransactionDAO() {
		db = new HashMap<String, TransactionDTO>();
	}

	@Override
	public void insert(TransactionDTO v) throws Exception {
		db.put(v.getDate(), v);

	}

	@Override
	public void delete(String k) throws Exception {
		// 삭제기능 안만들것.

	}

	@Override
	public void update(TransactionDTO v) throws Exception {
		// 수정 기능 안만들것.
	}

	@Override
	public TransactionDTO select(String k) throws Exception {
		TransactionDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> select() throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col = db.values();
		for (TransactionDTO obj : col) {
			list.add(obj);
		}
		return list;
	}

	@Override
	public List<TransactionDTO> search(Object obj) throws Exception {
		// 특정 계좌번호의 거래내역 조회
		// obj = account
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		// 생성을 해야할 때는 new, 불러오기만 할때는 null~
		Collection<TransactionDTO> col = db.values();

		for (TransactionDTO tr : col) {
			// 거래내역 중에서 id가 obj와 같은 같은 것들만 집어넣어라...!
			if (tr.getAccNo().equals(obj)) {
				list.add(tr);
			}
		}
		return list;

	}

}
