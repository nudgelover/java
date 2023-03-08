package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String,UserDTO>{
	//DAO<String,UserDTO>  아 ~ Generic에 대한 상세정보를 여기서 자세하게 적는 구나(어떤 타입을 쓸 것인지)
	//Object은 한계가 있다...!

	@Override
	public void insert(UserDTO v) throws Exception  {
		if(v.getId().equals("id01")) {
			//우리 시스템에 id01이란 아이디가 이미 생성되어있다고 가정해보자
			throw new Exception("EX0004");
		}
		System.out.println(v.getId()+"님이 저장 되었습니다.");
		//Generic을 쓰니 get 도 쓸 수 있네! object 쓸 땐 안됬는데!
		
	}

	@Override
	public void delete(String k) throws Exception {
		if(k.equals("id01")) {
			throw new Exception("EX0005");
		}
		System.out.println(k+"님이 삭제되었습니다.");
		
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if(v.getId().equals("id01")) {
			throw new Exception("EX0006");
		}
		System.out.println(v.getId()+"님의 정보가 수정되었습니다");
		
	}

	

}
