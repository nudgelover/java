package com.kbstar.frame;

import java.util.List;

public interface DAO<K, V> {
	//가장 중요한 DAO를 먼저 만들고~~~~~ 다 만들었으면APP 만들러 가자 
	// CRUD(Create, Read, Update, Delete)
	public void insert(V v) throws Exception;

	public void update(V v) throws Exception;

	public void delete(K k) throws Exception;

	public V select(K k) throws Exception;

	// K에 해당하는 한명의 고객정보를 가져와라
	public List<V> select();
	// 모든 고객정보를 다 가져와서 list에 정렬시켜라!
}
