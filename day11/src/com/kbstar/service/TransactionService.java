package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class TransactionService implements CRUDService<String, TransactionDTO> {
	DAO<String, TransactionDTO> tranDao;

	public TransactionService() {
		tranDao = new TransactionDAO();
	}

	@Override
	public void register(TransactionDTO v) throws Exception {
		tranDao.insert(v);

	}

	@Override
	public void remove(String k) throws Exception {
		// 삭제기능없음

	}

	@Override
	public void modify(TransactionDTO v) throws Exception {
		// 수정기능없음

	}

	@Override
	public TransactionDTO get(String k) throws Exception {
		TransactionDTO obj = null;
		obj = tranDao.select(k);

		return obj;
	}

	@Override
	public List<TransactionDTO> get() throws Exception {
		List<TransactionDTO> list = null;
		list= tranDao.select();
		return list;
	}

}
