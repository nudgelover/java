package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO> {
	// 두번째 DAO! <key값! - id가 보통 키값인데 int였지 근데 int라고 쓰면 안됨..!, 밸류>
	@Override
	public void insert(ItemDTO v) throws Exception {
		if(v.getId()==1) {
			throw new Exception("EX0005");
		}
		connect();
		System.out.println(v);
		System.out.println("상품내역이 저장되었습니다.");
		close();
	}

	@Override
	public void delete(Integer k) throws Exception {
		if(k==1) {
			throw new Exception("EX0005");
		}
		connect();
		System.out.println(k);
		System.out.println("상품내역을 삭제하였습니다.");
		close();

	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(v.getId()==1) {
			throw new Exception("EX0005");
		}
		System.out.println(v);
		System.out.println("상품정보가 수정되었습니다.");

	}

}
