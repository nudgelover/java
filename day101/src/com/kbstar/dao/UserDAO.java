package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO> {
	// 상속해주고
	HashMap<String, UserDTO> db = null;

	public UserDAO() {
		db = new HashMap<>();
	}
	// 데이터베이스 선언!

	@Override
	public void insert(UserDTO v) throws Exception {
		if (db.containsKey(v.getId())) {
			throw new Exception("중복된 아이디");
		}
		db.put(v.getId(), v);
		// System.out.println(v.getId()+"님 환영합니다. 가입이 완료되셨습니다.");
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if (!db.containsKey(v.getId())) {
			throw new Exception("존재하지 않는 ID");
		}
		db.put(v.getId(), v);
		// insert랑 똑같음 바뀐걸 다시 넣는 거라서

	}

	@Override
	public void delete(String k) throws Exception {
		if (!db.containsKey(k)) {
			throw new Exception("존재하지 않는 ID");
		}
		db.remove(k);
	}

	@Override
	public UserDTO select(String k) throws Exception {
		if (!db.containsKey(k)) {
			throw new Exception("존재하지 않는 ID");
		}

		UserDTO user = null;
		user = db.get(k);
		return user;
	}

	@Override
	public List<UserDTO> select() {
		// list를 만들어서 보내야하는데 list는 interface니 만들 수가 없다. 따라서 arraylist를 만들어 보내주자
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		// db.values로 값을 가져와야지. 이 값은 collection으로 가져오니까...!
		Collection<UserDTO> col = db.values();
		for (UserDTO u : col) {
			list.add(u);
		}
		return list;
	}

}
