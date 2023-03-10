package com.kbstar.frame;

import java.util.List;

public interface DAO<K, V> {
	public void insert(V v) throws Exception;

	public void delete(K k) throws Exception;

	public void update(V v) throws Exception;

	public V select(K k) throws Exception;

	public List<V> select() throws Exception;
	//원랜 여기까지였는데... 계좌 거래내역 생성을 위해 DAO에 추가 기능 설정함....

	public List<V> search(Object obj) throws Exception;
	
}
