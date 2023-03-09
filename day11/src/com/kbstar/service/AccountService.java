package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class AccountService implements CRUDService<String, AccountDTO> {

	DAO<String, AccountDTO> accDao;
	Notification notification;

	public AccountService() {
		accDao = new AccountDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(AccountDTO v) throws Exception {
		accDao.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			accDao.delete(k);
		} catch (Exception e) {
			throw new Exception("해당 계좌번호는 존재하지 않습니다.");
		}

	}

	@Override
	public void modify(AccountDTO v) throws Exception {
		// 수정기능없음

	}

	@Override
	public AccountDTO get(String k) throws Exception {
		try {
		AccountDTO obj = null;
		obj = accDao.select(k);

		return obj;}
		catch(Exception e) {
			throw new Exception("해당 계좌번호는 존재하지 않습니다.");
		}
		
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		List<AccountDTO> list = null;
		list = accDao.select();
		return list;
	}

}
