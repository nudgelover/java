package com.kbstar.frame;

public interface DAO {
	//Data Access Object
	//오직 DB에 DATA을 입력하고 삭제하고 수정하는 기능만 함! 
	public void insert(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	

}
