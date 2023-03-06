package com.kbstar.frame;

public interface DAO<K,V> {
	//Generic, 어떤 타입이 올지 모르겠을 때 선언하는 방법
	public void insert(V v);
	public void delete(K k);
	public void update(V v);
	

}
