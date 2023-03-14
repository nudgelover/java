package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class CustCRUDServiceImpl implements CRUDService<String, Cust> {
	DAO<String, String, Cust> dao;

	public CustCRUDServiceImpl() {
		dao = new CustDaoImpl();
	}

	@Override
	public void register(Cust v) throws Exception {
		// 데이터 검증
		// DB 입력
		// email,sms 전송
		try {
			dao.insert(v);
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("ID가 중복되었습니다");
			} else {
				throw new Exception("시스템 장애 입니다.");
			}
		}
	}

	@Override
	public void modify(Cust v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("해당 ID는 존재하지 않습니다.");
			}
		}
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("해당 ID는 존재하지 않습니다.");
			}
		}

	}

	@Override
	public Cust get(String k) throws Exception {
		Cust cust = null;
		try {
			cust = dao.select(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다. 잠시 후 다시 시도 해주세요.");
			} else {
				throw new Exception("해당 ID는 존재하지 않습니다.");
			}
		}
		return cust;
	}

	@Override
	public List<Cust> get() throws Exception {
		List<Cust> list = null;//이땐 null인이유... custdaoimpl에서 받는거니까..!
		try {
			list = dao.selectAll();
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다. 잠시 후 다시 시도 해주세요.");
			}
//			} else {
//				throw new Exception("현재 DB에 저장된 내역이 없습니다.");
//			} 이건 예외처리가 안나서.. 아무런 반응이 안나옴... 여려가지 방법이 있지만 app페이지에서 막아주자...!
		}
		return list;
	}

}
